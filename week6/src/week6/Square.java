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
public class Square extends Rectangle {


    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String a, boolean b) {
        super(side, side, a, b);
    }
    public double getSide()
    {
        return this.getWidth();
    }
    public void setSide(double side)
    {
        setWidth(side);
        setLength(side);
    }
    public void setwidth(double side)
    {
        this.setSide(side);
    }
    public void setlength(double side)
    {
        this.setSide(side);
    }
    
    @Override
    public String toString() {
        return "Square{" + getSide() + '}';
    }

    
}