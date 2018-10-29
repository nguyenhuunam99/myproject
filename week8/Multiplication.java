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
public class Multiplication extends BinaryExpression{
    public Multiplication(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		String mul =  "(" + this.left.toString() + " * " + this.right.toString() + ")";
		return mul;
	}

	@Override
	public int evaluate() {
		return this.left.evaluate() * this.right.evaluate();
	}
}