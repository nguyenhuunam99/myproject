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
public class Division extends BinaryExpression{
    public Division(Expression left,Expression right)
    {
        super(left, right);
    }
    @Override
    public String toString()
    {
        String sub = "(" + this.left.toString()+ " / " +this.right.toString() + ")";
        return sub;
    }
    @Override
    public int evaluate()
    {
        return this.left.evaluate()/this.right.evaluate();
    }
}