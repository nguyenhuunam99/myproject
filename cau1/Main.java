/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        
        CamSanh a=new CamSanh("Bac Ninh","5cm","Cam Sanh","vang","ngot");
        a.setPrice(100000);
        a.setType(1);
        System.out.println(a.getColor());
        System.out.println(a.getPrice());
    }
}
