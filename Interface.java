interface  Computer{
    public abstract void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Laptop is coding...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Desktop is coding...");
    }
}

class Developer{
    public void develop(Computer laptop){
        laptop.code();
        System.out.println("Developer is developing...");
    }
}





public class Interface {

    public static void main(String[] args) {
        Developer dev = new Developer();
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        dev.develop((Laptop) laptop);
        dev.develop(desktop);   
        
    }
    
}
