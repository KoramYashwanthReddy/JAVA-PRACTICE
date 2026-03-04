class Calculator{

    public int add(int i , int j , int k){
        return i+j+k;
    }

public int add(double l , int m ){
    return (int)(l+m);
}

}


public class MethodOverloading {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int result = cal.add(10, 20 , 30);
        System.out.println("Result: " + result);
        int result2 = cal.add(10.5, 20);
        System.out.println("Result: " + result2);
        
    }
    
}
