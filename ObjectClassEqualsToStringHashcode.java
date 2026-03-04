class Laptop{
     String model;
     int price;

     public String toString(){
        return "Model: " + model + ", Price: " + price;
     }

     @Override
     public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
     }

     @Override
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
     }


}

public class ObjectClassEqualsToStringHashcode {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        laptop1.model = "Dell";
        laptop1.price = 50000;
        laptop2.model = "Dell";
        laptop2.price = 50000;

        boolean result = laptop1.equals(laptop2);
        System.out.println("Are laptop1 and laptop2 equal? " + result);
        System.out.println(laptop1);


    }
    
}
