abstract class A{
    public abstract void show();
    public abstract void display();
}


public class AbstractAndAnonymousInnerClass {

    public static void main(String[] args) {
        A a = new A() {
            public void show() {
                System.out.println("Hello");
            }
            public void display() {
                System.out.println("Displaying");
            }
        };
        a.show();
        a.display();




    }
    
}
