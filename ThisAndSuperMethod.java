class A{
    public A(){
        super();
        System.out.println("Constructor of class A");
    }
    public A(int n){
        super();
        System.out.println("Constructor of class A with parameter: " + n);
    }

}
class B extends A{ 
    public B(){
        super(); // Call the superclass constructor
        System.out.println("Constructor of class B");
    }
    public B(int n){
        this();
        System.out.println("Constructor of class B with parameter: " + n);

    }
   
}
public class ThisAndSuperMethod {
    public static void main(String[] args) {
        
        B obj = new B(5);

    }
    
}
