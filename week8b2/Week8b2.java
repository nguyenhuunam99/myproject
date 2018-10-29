/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8b2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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
    public static void nullpoint() throws NullPointerException
    {
        String s= null;
        System.out.println(s.length());
    }
    public static void classcast() throws ClassCastException{
         Object x = new Integer(10);
        System.out.println((String) x);
    }
 //   public static void
    public static void io() throws FileNotFoundException, IOException{
        FileInputStream file = new FileInputStream("2.txt");
        file.read();
        
    }
    public static void main(String[] args) throws IOException
    {
        try {
            int c=divison(2,0);
            nullpoint();
            classcast();
            print();
            io();
            
        } catch (Exception e) {
            System.out.println("Error!");
        }
        
    }
}