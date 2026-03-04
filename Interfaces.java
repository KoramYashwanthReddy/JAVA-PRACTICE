
interface A {

    int age = 10; // public static final by default
    String name = "John"; // public static final by default
      void m1();
      void m2();
}

class B implements A {

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }
    
}
public class Interfaces {

    public static void main(String[] args) {
        A a;
        a = new B();
        a.m1();
            a.m2();
            System.out.println(a.age);
            System.out.println(a.name);

    }
    
}
