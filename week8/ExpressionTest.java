/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author Admin
 */
public class ExpressionTest {
    public static void main(String[] args) {
		Expression num1 = new Numeral(1);
		Expression num2 = new Numeral(2);
		Expression num3 = new Numeral(3);
		Expression num10 = new Numeral(10);
		Expression num0 = new Numeral(0);
		try {
			Expression chia = new Division(num1, num0);
			System.out.println(chia.evaluate());
		} catch (Exception e) {
			System.out.println("division 0");
		}
		
		Expression s1 = new Square(num10); // 10^2
		Expression s2 = new Subtraction(s1, num1);// 10^2-1
		Expression s3 = new Multiplication(num2, num3);//2*3
		Expression s4 = new Addition(s2, s3); //(10^2-1+2*3)^2
		Expression Result = new Square(s4);
		System.out.println(Result.toString() + " = " + Result.evaluate());
		
		
	}
}