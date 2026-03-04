class A{
    public void show(){
        System.out.println("Method in class A");
    }

   public A(){
        System.out.println("Object Created");
       
   }
}


public class AnonymousObject {
    public static void main(String[] args) {
       
        new A().show(); // Anonymous Object created and constructor called

    }
    
}
