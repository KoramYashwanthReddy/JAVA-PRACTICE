

@FunctionalInterface
interface A{
    void show();
}
// }
// class B implements A{

//     @Override
//     public void show() {
//         System.out.println("Hello World");
//     }
    
// }





public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        
        A a = (A) new A()
        {
            @Override
            public void show() {
                System.out.println("Hello World");
            }
        };
        a.show();
    }
    
}
