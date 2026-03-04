public class Logical {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int c = 30;

        // Logical AND (&&)
        boolean andResult = (a < b) && (b < c); // true && true -> true
        System.out.println("Logical AND result: " + andResult);

        // Logical OR (||)
        boolean orResult = (a > b) || (b < c); // false || true -> true
        System.out.println("Logical OR result: " + orResult);

        // Logical NOT (!)
        boolean notResult = !(a < b); // !(true) -> false
        System.out.println("Logical NOT result: " + notResult);


    }
    
}
