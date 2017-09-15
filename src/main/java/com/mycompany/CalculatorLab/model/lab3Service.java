/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.CalculatorLab.model;

/**
 *
 * @author Nolan
 */
public class lab3Service {

    
    public double calculateAreaRectangle(double length, double width){
        double area = length * width;
        return area;       
    }
    
    public double calculateAreaCircle(double radius) {
        double area = Math.PI * (radius * radius); 
        return area;
    }
    
    public double calculateHypTriangle(double x, double y) {
        double area = Math.sqrt((x*x)+(y*y));
        return area; 
    }
    
    
}
