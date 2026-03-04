class Mobile {
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

    static {
        name = "Default Mobile Name";
        System.out.println("Static block executed. Name initialized to: " + name);
    }

    public Mobile(){
        brand = "Unknown";
        price = 0;
            System.out.println("Constructor executed. Brand: " + brand + ", Price: " + price);
    }
}


public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {

/*      Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 100000;
        Mobile.name = "Iphone 14 Pro Max";

        mobile1.show();


        Mobile mobile2 = new Mobile();


        */

        Class.forName("Mobile");

    }
    
}
