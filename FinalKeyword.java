final class Calculator {
    // This class cannot be subclassed because it is declared as final
    final public void show(){
        // This method cannot be overridden because it is declared as final
        System.out.println("This is a calculator.");
    }
    public void add(int a, int b){
        System.out.println("This method adds two numbers." + (a+b));
    }
}
public class FinalKeyword {

    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // This will cause a compile-time error because x is final

        final String name = "John";
        // name = "Doe"; // This will also cause a compile-time error because name is final

        System.out.println("Value of x: " + x);
        System.out.println("Name: " + name);

        Calculator calc = new Calculator();
        calc.show();
        calc.add(5, 3);
    }
    
}
