

public class TryWithMultipleatch {

    public static void main(String[] args) {

        int i = 2;
        int j = 0;
        String str = null;

        int nums[] = new int[5];

        try {
            j = 10 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

            
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.. ");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay with in the limits of the array.. ");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred.. " + e);
        }

        System.out.println("Try with multiple catch block..");
        
    }
    
}
