package Array;

public class sumTwoMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 0, 1},
                {4, 5, 6},
                {1, 2, 3}
        };

        int[][] b = {
                {1, 1, 1},
                {2, 3, 1},
                {1, 5, 1}
        };
        int row=a.length;
        int col=a[0].length;
        int[][] res= new int[row][col];
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
