<%-- 
    Document   : forgot
    Created on : Apr 11, 2022, 2:29:40 PM
    Author     : 752808
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password JSP</title>
    </head>
    <body>
        <h1>Forgot Password</h1>
        
        <h2>Please enter your email address to retrieve your password.</h2>
        <form action="forgot" method="post">
            <label>Email Address: </label>
            <input type="email" id="email" name="email"><br>
            <input type="submit" value="Submit">
        </form>
        
             <a href="login">Click here to go back to the Login Page</a>
              <br>
        ${message}
    </body>
</html>
