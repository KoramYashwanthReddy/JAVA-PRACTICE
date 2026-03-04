public class StringDemo {
    public static void main(String[] args) {


        String name = "Alice";
        System.out.println("Hello, " + name + "!");

        String Name = new String("Yash");
        
        System.out.println("Hello, " + Name + "!");
        System.out.println(name.hashCode());
        System.out.println(Name.hashCode());
        System.out.println(name.charAt(1));
        System.out.println(Name.charAt(1));
        System.out.println(Name.concat(" Reddy"));



        name = name + " Reddy";
        System.out.println(name);


        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); // true, because of string interning
        
    }
    
}
