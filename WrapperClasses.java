




public class WrapperClasses {

    public static void main(String[] args) {
        
         int num = 10;
         Integer numWrapper = Integer.valueOf(num); // Boxing
         Integer num1 = numWrapper;  //auto-boxing

         System.out.println("Wrapped Integer: " + numWrapper);
            System.out.println("Auto-boxed Integer: " + num1);


            int unboxedNum = numWrapper.intValue(); // Unboxing
            int num2 = numWrapper; // Auto-unboxing
            System.out.println("Unboxed Integer: " + unboxedNum);
            System.out.println("Auto-unboxed Integer: " + num2); // Auto-unboxing

                String strNum = "20";
                int parsedNum = Integer.parseInt(strNum); // Parsing String to int
                System.out.println("Parsed Integer from String: " + parsedNum);





    }
    
}
