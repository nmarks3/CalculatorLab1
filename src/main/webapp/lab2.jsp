<%-- 
    Document   : lab2
    Created on : Sep 12, 2017, 8:10:07 PM
    Author     : Nolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Area of a Rectangle</h1>
        <img style="width:400px;height:300px;" src="http://spiff.rit.edu/classes/phys311/workshops/w1b/rectangle.gif">

        <form id=”rectangleForm” name=”rectangleForm” method="POST" action=lab2Controller >
            <p>Length: &nbsp;<input type="text" name="length" id="length" value="" placeholder="ex: 3, 3.4, 3.44"></p>
            <p>Width: &nbsp;&nbsp;<input type="text" name="width" id="width" value="" placeholder="ex: 3, 3.4, 3.44"></p>
            <input type="submit" id="submit" name="submit" value="Get Area">
            <h3>${result}</h3>
            <p>${msg}</p>
        </form>
    </body>
</html>
