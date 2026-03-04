class Human{

    private int age;
    private String name;


    public Human(){
        age = 21;
        name = "Yash";
    }
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}


public class Constructor {

    public static void main(String[] args) {

       
        Human human = new Human();
        Human human2 = new Human(22 , "Yash");

         System.out.println(human.getName() + " is " + human.getAge() + " years old.");
         System.out.println(human2.getName() + " is " + human2.getAge() + " years old.");


        human.setName("John");
        human.setAge(30);

        System.out.println(human.getName() + " is " + human.getAge() + " years old.");
    }
    
}
