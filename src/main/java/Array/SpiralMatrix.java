package Array;

public class SpiralMatrix {
    public static void main(String[] args) {
        /*nput: n = 3
        Output: [[1,2,3],
   [8,9,4],
   [7,6,5]]

        Example 2:
        Input: n = 1
        Output: [[1]]*/
        int n = 4; // Change this to the desired matrix size
        int[][] matrix = spiralMatrix(n);

        // Print the resulting matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] spiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1; //represent the leftmost, rightmost, topmost, and bottommost boundaries, respectively.

        while (num <= n * n) {
            // Move to the right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Move to the left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // Move up
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }
}
