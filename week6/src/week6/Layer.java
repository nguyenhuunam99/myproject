/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class Layer {

    public ArrayList<Shape> layer = new ArrayList<>();
    public boolean visible;
    public Scanner input = new Scanner(System.in);

    public void Nhap() {
        while (true) {
            System.out.println("0.Exit");
            System.out.println("1.Square");
            System.out.println("2.Rectangle");
            System.out.println("3.Triangle");
            System.out.println("4.Circle");
            System.out.println("Nhap lua chon cua ban : ");
            int n;
            n = input.nextInt();
            int k=5;
            switch (n) {
                case 1: {

                    double side = input.nextDouble();
                    Square tmp = new Square(side);
                    layer.add(tmp);
                }
                ;
                break;
                case 2: {
                    double width = input.nextDouble();
                    double length = input.nextDouble();
                    Rectangle tmp = new Rectangle(width, length);
                    layer.add(tmp);
                }
                ;
                break;
                case 3: {
                    double side1=input.nextDouble();
                    double side2=input.nextDouble();
                    double side3=input.nextDouble();
                    Triangle tmp=new Triangle(side1,side2,side3);
                   layer.add(tmp);
                };break;
                case 4: {
                    double radius=input.nextDouble();
                    Circle tmp=new Circle(radius);
                    layer.add(tmp);
                };break;
                case 0 : {
                    k=0;
                };break;
            }
            if(k==0) break;
        }
    }
    public void removeTriangle() {
		
		for(int i = 0 ; i < layer.size() ; i++) {
			if(layer.get(i) instanceof Triangle) {
			layer.remove(i);
			i--;}
		}
	}
    public void xuat()
    {
        for(int i=0;i<layer.size();i++)
        {
            System.out.println(layer.get(i));
        }
    }
}
