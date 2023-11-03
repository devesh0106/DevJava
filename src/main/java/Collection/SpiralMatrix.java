package Collection;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 3;  // Change this to the desired matrix size (e.g., 3x3 for the given input)
        int[][] matrix = new int[n][n];
        int[] NUM = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int numIndex = 0;

        while (left <= right && top <= bottom) {
            // Move to the right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = NUM[numIndex++];
            }
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = NUM[numIndex++];
            }
            right--;

            // Move to the left (if there are still values to insert)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = NUM[numIndex++];
                }
                bottom--;
            }

            // Move up (if there are still values to insert)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = NUM[numIndex++];
                }
                left++;
            }
        }

        // Print the resulting matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

