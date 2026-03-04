
public class SintificCalculator extends AdvancedCalculator {
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }
}
