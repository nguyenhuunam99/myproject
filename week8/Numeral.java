package week8;

/**
 *
 * @author Admin
 */
public class Numeral extends Expression{
    private int value;
    public Numeral() {
    }

    public Numeral(int value) {
        this.value = value;
    }

    @Override
	public String toString() {
		String num = Integer.toString(value);
		return num;	
	}

	@Override
	public int evaluate() {
		return this.value;
	}
}