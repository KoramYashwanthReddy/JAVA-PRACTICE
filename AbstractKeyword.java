abstract class  Car{

    public abstract void Drive();
    public abstract void fly();

    public void PlayMusic(){
            System.out.println("Playing music in the car");
    }
}
abstract class Wagon extends Car{
    public void Drive() {
        System.out.println("Driving the wagon");
    }

}
class UpdateWagon extends Wagon{
    @Override
    public void fly() {
        System.out.println("Flying the wagon");
    }
}

public class AbstractKeyword {

    public static void main(String[] args) {
        Car myCar = new UpdateWagon();
        myCar.Drive();
        myCar.PlayMusic();
        myCar.fly();
    }
    
}
