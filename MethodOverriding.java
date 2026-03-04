class Calculator{
    public int add(int a, int b){
        System.out.println("In class A");
        return a + b;
    }
}
class Advanced extends Calculator{
   public int add(int a, int b){
        System.out.println("In class B");
        return a + b + 10;
    }
  
}
public class MethodOverriding {
    public static void main(String[] args) {
        Advanced obj = new Advanced();
        int sum = obj.add(5, 10);
        System.out.println(sum);
        
    }
    
}
