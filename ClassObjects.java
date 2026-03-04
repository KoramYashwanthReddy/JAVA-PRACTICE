class calculator
{
    int a = 10;
    public int add(int i , int j)
    {
        int r = i + j;
        return r;
    }

}
public class ClassObjects {
    public static void main(String[] args) {

        calculator obj = new calculator();
         
        int num1 = 10;
        int num2 = 20;

        int result = obj.add(num1 , num2);
        System.out.println("Result: " + result);

    }
    
}
