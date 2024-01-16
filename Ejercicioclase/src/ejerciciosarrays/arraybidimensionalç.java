package ejerciciosarrays;

public class arraybidimensionalç {
    public static void main(String[] args) {
        int[][] bd = new int[5][5];
        for (int i = 0; i <bd.length ; i++) {
            for (int j = 0;j<bd.length ; j++) {
                if (i == j) {
                    bd[i][j] = 1;
                }else{
                    bd[i][j] = 0;

                }


            }
        }



        for (int i = 0; i < bd.length ; i++) {
            System.out.println(" ");
            for (int j = 0; j < bd.length ; j++) {
                System.out.print(bd[i][j] + " ");

            }

        }
    }
}
