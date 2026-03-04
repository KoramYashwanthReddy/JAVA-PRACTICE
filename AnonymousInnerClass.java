class A{
    public void Show(){
        System.out.println("Hello");
    }
}







public class AnonymousInnerClass {

    public static void main(String[] args) {
        A a = new A() {
            public void Show() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };
        a.Show();
        
    }
    
}
