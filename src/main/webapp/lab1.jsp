<%-- 
    Document   : lab1
    Created on : Sep 12, 2017, 8:10:01 PM
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
        
        <form id=”rectangleForm” name=”rectangleForm” method=”POST” action=lab1Controller>
            <p>Length: &nbsp;<input type="text" name="length" id="length" value=""></p>
            <p>Width: &nbsp;&nbsp;<input type="text" name="width" id="width" value=""></p>
            <input type="submit" id="submit" name="submit" value="Get Area">
        </form>

    </body>
</html>
