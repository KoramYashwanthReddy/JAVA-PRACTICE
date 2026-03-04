enum Laptop{
    MacBook(2000) , ThinkPad(2200) , Surface() , XPS(1800);

    private int price;

    private Laptop(){
        this.price = 1000; // Default price for Surface laptop

    }


    Laptop(int price){
        this.price = price;
        System.out.println("Constructor called for " + this + " with price " + price);
    }

    public int getPrice(){
        return price;
    }

}

public class EnumClass {

    public static void main(String[] args) {
        Laptop laptop = Laptop.ThinkPad;
        System.out.println(laptop);
        System.out.println(laptop.getPrice());

        for(Laptop l : Laptop.values()){
            System.out.println(l + " costs $" + l.getPrice());
        }
        
    }
    
}
