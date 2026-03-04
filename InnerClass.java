class A{
    int age;
    public void show(){
        System.out.println("Hello from class A");
    }
    static class B{
       public void config(){
              System.out.println("Hello from class B");
       }
    }
}


public class InnerClass {

    public static void main(String[] args) {
        A a = new A();
        a.show();
        A.B b = new A.B();
        b.config();
        
    }
    
}
