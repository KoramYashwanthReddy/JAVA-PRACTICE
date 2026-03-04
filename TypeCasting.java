public class TypeCasting {

    public static void main(String[] args) {
        
        byte b = 125;
        int a = 12;
        byte k = (byte) a;


        float f = 63.47f;
        int t = (int) f;
        System.out.println("Byte value: " + k);
        System.out.println("Float to int value: " + t);
        byte x = 10;
        byte y = 30;
        int result = x * y; // result is 300, which is an int
        System.out.println("Result of byte multiplication: " + result);
    }
    
}
