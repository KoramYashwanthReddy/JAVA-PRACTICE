class computer{

    public void playMusic(){
        System.out.println("Playing music...");
    }

    public String getPen(int cost){
        if(cost >= 10)
            return "Here is your pen.";
        
        return "Nothing";
        

    }
}

public class Methods {

    public static void main(String[] args) {

        computer com = new computer();
        com.playMusic();
        String str = com.getPen(15);
        System.out.println(str);
        


    }
    
}
