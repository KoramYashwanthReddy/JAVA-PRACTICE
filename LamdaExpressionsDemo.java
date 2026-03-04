

@FunctionalInterface
interface A{
    void show(int i);

}


@FunctionalInterface
interface B{
    int add(int a, int b);
}

public class LamdaExpressionsDemo {

    public static void main(String[] args) {

        A a =  (i) -> System.out.println("Hello World " +i);
        a.show(10);

        B b = ( i ,  j) -> i+j;
        int result = b.add(10, 20);
        System.out.println("Result is " +result);

    }
    
}
