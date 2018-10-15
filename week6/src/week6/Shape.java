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
public class Shape {

    private String color;
    private boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String a, boolean b) {
        color = a;
        filled = b;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String a) {
        color = a;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean a) {
        filled = a;
    }

    @Override
    public String toString() {
        return "shape{" + "color=" + color + ", filled=" + filled + '}';
    }
}