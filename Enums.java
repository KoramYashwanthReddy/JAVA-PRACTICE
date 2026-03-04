enum Status{
    Running , Failed , Success , Pending
}

public class Enums {

    public static void main(String[] args) {

        Status s = Status.Running;
        
        System.out.println(s.getClass().getSuperclass());

        switch(s){
            case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            default:
                System.out.println("Success");
        }

        if(s == Status.Running){
            System.out.println("Running");
        }
        else if(s == Status.Failed){
            System.out.println("Failed");
        }
        else if(s == Status.Pending){
            System.out.println("Pending");
        }
        else {
            System.out.println("Success");
        }
        
    }
    
}
