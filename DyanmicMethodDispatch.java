
class A {
    void show() {
        System.out.println("In A");
    }
}
class B extends A {
    void show() {
        System.out.println("In B");
    }
}
class C extends B {
    void show() {
        System.out.println("In C");
    }
}







public class DyanmicMethodDispatch {
    public static void main(String[] args) {


        A b = new A();
        b.show();
        b = new B();
        b.show();
        b = new C();
        b.show();
        
    }
    
}
