package week8;

/**
 *
 * @author Admin
 */
public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		String add =  "(" + this.left.toString() + " + " + this.right.toString() + ")";
		return add;
	}

	@Override
	public int evaluate() {
		return this.left.evaluate() + this.right.evaluate();
	}
}