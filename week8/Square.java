package week8;

/**
 *
 * @author Admin
 */
public class Square extends Expression {

    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }
    @Override
	public String toString() {
		String square = "(" + this.expression + "^2)";
		return square;
	}
	@Override
	public int evaluate() {
		return  (int) Math.pow((int)this.expression.evaluate(), 2);
	}
}