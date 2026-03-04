


class A{
    
    public void showTheDataBelongsToThisClass(){
        System.out.println("A");
    }

}
class B extends A{
    @Override
    public void showTheDataBelongsToThisClass(){
        System.out.println("B");
    }

}


public class Annotations {

    public static void main(String[] args) {
        B b = new B();
        b.showTheDataBelongsToThisClass();
    }
    
}
