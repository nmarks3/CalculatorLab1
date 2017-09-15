<%-- 
    Document   : lab3
    Created on : Sep 12, 2017, 8:10:15 PM
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

        <form id=”rectangleForm” name=”rectangleForm” method="POST" action=lab3Controller?calcType=rectangleForm >
            <p>Length: &nbsp;<input type="text" name="rLength" id="rLength" value="" placeholder="ex: 3, 3.4, 3.44"></p>
            <p>Width: &nbsp;&nbsp;<input type="text" name="rWidth" id="rWidth" value="" placeholder="ex: 3, 3.4, 3.44"></p>
            <input type="submit" id="submitRectangle" name="submitRectangle" value="Get Area">
            <h3>${recResult}</h3>
            <p>${recMsg}</p>
        </form>
            
            <h1>Area of a Circle</h1>
        <img style="width:400px;height:300px;" src="http://m.mathblaster.com/Mathblaster/CoolMath/Article-Images/radius-of-a-circle.jpg">
        
        <form id=”circleForm” name=”circleForm” method="POST" action=lab3Controller?calcType=circleForm >
            <p>Radius: &nbsp;<input type="text" name="radius" id="radius" value="" placeholder="ex: 3, 3.4, 3.44"></p>
            <input type="submit" id="submitCircle" name="submitCircle" value="Get Area">
            <h3>${cirResult}</h3>
            <p>${cirMsg}</p>
        </form>
        
            <h1>Hypotenuse of a Triangle</h1>
        <img style="width:400px;height:300px;" src="http://www.gradeway.com/lessons/math/img/tri_hypotenuse.gif">

        <form id=”triangleForm” name=”triangleForm” method="POST" action=lab3Controller?calcType=triangleForm >
            <p>Value of X: &nbsp;<input type="text" name="tx" id="tx" value="" placeholder="ex: 3, 3.4, 3.44"></p>
            <p>Value of Y: &nbsp;&nbsp;<input type="text" name="ty" id="ty" value="" placeholder="ex: 3, 3.4, 3.44"></p>
            <input type="submit" id="submitTriangle" name="submitTriangle" value="Get Hypotenuse">
            <h3>${triResult}</h3>
            <p>${triMsg}</p>
        </form>  
    </body>
</html>
