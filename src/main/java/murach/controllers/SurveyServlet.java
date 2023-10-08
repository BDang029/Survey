package murach.controllers;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import murach.business.User;

@WebServlet("/survey")
public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "index.html";
        
        // get current action
        String action = request.getParameter("action");
        
        System.out.println("action: " + action);
                        
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        
        else if (action.equals("add")) {

        
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String birthDate =  (String) request.getParameter("dateOfBirth");
        String heardFrom = request.getParameter("heardFrom");
        String wantsUpdates = request.getParameter("wantsUpdates");
        String contactVia = request.getParameter("contactVia");
        
        // process paramters
        if (heardFrom == null) {
            heardFrom = "NA";
        }
        if (wantsUpdates == null) {
            wantsUpdates = "No";
        }
        else {
            wantsUpdates = "Yes";
        }
        
        // store data in User object
        User user = new User(firstName, lastName, email,birthDate, heardFrom, wantsUpdates,contactVia);
        
//        user.setFirstName(firstName);
//        user.setLastName(lastName);
//        user.setEmail(email);        
//        user.setHeardFrom(heardFrom);        
//        user.setWantsUpdates(wantsUpdates);
//        user.setContactVia(contactVia);

        // store User object in request
        request.setAttribute("user", user);
        
        // forward request to JSP

        url = "/survey.jsp";

        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}