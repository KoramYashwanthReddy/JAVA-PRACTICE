

public class Arrays {
    public static void main(String[] args) {

        int nums[] = {1 , 2 , 3 , 4 , 5};
        System.out.println(nums[1]);
        for(int i = 0; i<= nums.length-1; i++){
            System.out.println(nums[i]);
        }
        int num[] = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        for(int i = 0; i<= num.length-1; i++){
            System.out.println(num[i]);
        }


    }
    
}
