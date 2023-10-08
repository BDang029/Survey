<%-- Document : survey Created on : Sep 28, 2023, 9:16:03 AM Author : ThangDz --%>
        <%@page contentType="text/html" pageEncoding="UTF-8" %>

            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="utf-8">
                <title>Thanks page</title>
                <link rel="stylesheet" href="styles/survey.css">
            </head>

            <body>
                <h1>Thanks for joining our email list</h1>

                <p>Here is the information that you entered:</p>
                <label>Email:</label>
                <span>${user.email}</span><br>
                <label>First Name:</label>
                <span>${user.firstName}</span><br>
                <label>Last Name:</label>
                <span>${user.lastName}</span><br>
                
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>             
                <c:if test="${user.birthDate != ''}">
                    <label>Birth Date:</label>
                    <span>${user.birthDate}</span><br>
                </c:if>
                    
                <label>Heard from:</label>
                <span>${user.heardFrom}</span><br>
                <label>Update:</label>
                <span>${user.wantsUpdates}</span><br><!-- comment -->



                <c:if test="${user.wantsUpdates != 'No'}">
                    <label>Contact via:</label>
                    <span>${user.contactVia}</span><br>
                </c:if>



                <p>To enter another email address, click on the Back
                    button in your browser or the Return button shown
                    below.</p>

                <form action="" method="post">
                    <input type="hidden" name="action" value="join">
                    <input type="submit" value="Return">
                </form>

            </body>

            </html>