class Mobile {
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

    public static void display(){
        System.out.println("This is a static method.");
    }
    public static void display1(Mobile mobile){
         System.out.println("Brand: " + mobile.brand);
        System.out.println("Price: " + mobile.price);
        System.out.println("Name: " + mobile.name);
    }
}


public class StaticMethod {


     public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 100000;
        Mobile.name = "Iphone 14 Pro Max";

         Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 80000;
        Mobile.name = "Galaxy S23 Ultra";

        mobile1.show();
        mobile2.show();

        Mobile.display();
        Mobile.display1(mobile1);
        Mobile.display1(mobile2);
        
    }
    
}
