package week8;

/**
 *
 * @author Admin
 */
public class Subtraction extends BinaryExpression{
    public Subtraction(Expression left,Expression right)
    {
        super(left, right);
    }
    @Override
    public String toString()
    {
        String sub = "(" + this.left.toString()+ " - " +this.right.toString() + ")";
        return sub;
    }
    @Override
    public int evaluate()
    {
        return this.left.evaluate()-this.right.evaluate();
    }
}