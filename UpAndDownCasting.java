class A{
    public void show(){
        System.out.println("This is class A");
    }

}
class B extends A{
    public void show2(){
        System.out.println("This is class B");
    }

}

public class UpAndDownCasting {

    public static void main(String[] args) {

        A a = (A) new B(); // Upcasting: B to A
        a.show();

        double d = 10.5;
        int i = (int) d; // Downcasting: double to int
        System.out.println("Integer value: " + i);
        System.out.println("Double value: " + d);

        B b = (B) a; // Downcasting: A to B
        b.show2();
        
    }
    
}
