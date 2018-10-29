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
public abstract class BinaryExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public Expression getLeft() {
		return left;
	}

    public Expression getRight() {
		return right;
	}

}