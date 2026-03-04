public class MultiDimentionalArray {

    public static void main(String[] args) {

        
        int set[][] = new int[3][4];
        int random = (int)Math.random() * 100;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set[i].length; j++) {
                set[i][j] = (int)(Math.random() * 10);
                System.out.print(set[i][j] + " ");
            }
            System.out.println();
        }


        for(int n[] : set){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }



    }
}

