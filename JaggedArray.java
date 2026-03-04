public class JaggedArray {

    public static void main(String[] args) {

        int set[][] = new int[3][];
        set[0] = new int[2];
        set[1] = new int[3];
        set[2] = new int[4];

        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set[i].length; j++) {
                set[i][j] = (int)(Math.random() * 10);
            }
        }

            for(int n[] : set){
                for(int m : n){
                    System.out.print(m + " ");
                }
                System.out.println();
            }




            int set2[][][] = new int[2][3][4];
            for (int i = 0; i < set2.length; i++) {
                for (int j = 0; j < set2[i].length; j++) {
                    for (int k = 0; k < set2[i][j].length; k++) {
                        set2[i][j][k] = (int)(Math.random() * 10);
                    }
                }
            }

             for(int n[][] : set2){
                for(int m[] : n){
                    for(int o : m){
                        System.out.print(o + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

    }
    
}
