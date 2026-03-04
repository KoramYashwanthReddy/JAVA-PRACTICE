class Human{

    private int age;
    private String name;

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
public class Encapsulation {

    public static void main(String[] args) {

        Human human = new Human();
        human.setName("John");
        human.setAge(30);

        System.out.println(human.getName() + " is " + human.getAge() + " years old.");
    }
    
}
