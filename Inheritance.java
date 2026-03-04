public class Inheritance {

    public static void main(String[] args) {

        SintificCalculator calculator = new SintificCalculator();
        int addResult = calculator.add(5, 3);
        int subtractResult = calculator.subtract(5, 3);
        int multiplyResult = calculator.multiply(5, 3);
        int divideResult = calculator.divide(10, 2);
        double powerResult = calculator.power(2, 3);
        double sqrtResult = calculator.squareRoot(16);
        System.out.println("We are using Inheritance in Java to create a hierarchy of calculators.");
        System.out.println("Addition Result: " + addResult);
        System.out.println("Subtraction Result: " + subtractResult);
        System.out.println("Multiplication Result: " + multiplyResult);
        System.out.println("Division Result: " + divideResult);
        System.out.println("Power Result: " + powerResult);
        System.out.println("Square Root Result: " + sqrtResult);
        
    }
    
}
