/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args)
    {
        Circle test=new Circle(3);
        System.out.println(test.getArea());
        Square test1=new Square(4);
        System.out.println(test1.getPerimeter());
        System.out.println(test.toString());
        System.out.println(test1.toString());
    }
}
