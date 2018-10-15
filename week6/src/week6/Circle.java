/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author Admin
 */
public class Circle extends Shape //class circle
{

    private double radius;
    final double pi=3.14;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String a, boolean b) {
        super(a, b);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double a) {
        radius = a;
    }

    public double getArea() {
        double area = radius * radius * pi;
        return area;
    }

    public double getPerimeter() {
        double perimeter = radius * 2 * pi;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", pi=" + pi + '}';
    }

}