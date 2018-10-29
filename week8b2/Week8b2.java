/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8b2;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Week8b2 {

    /**
     * @param args the command line arguments
     */
    public static int divison(int a, int b) throws ArithmeticException {
        int c=a/b;
        return c;
    }
    public static void print() throws IndexOutOfBoundsException
    {
        int a[] = {1,3};
        System.out.println(a[2]);
    }
    public static void nullpoint() //throws NullPointerException
    {
        String s= null;
        System.out.println(s.length());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            nullpoint();
        } catch (Exception e) {
            System.out.println("error");
        }

    }

}
