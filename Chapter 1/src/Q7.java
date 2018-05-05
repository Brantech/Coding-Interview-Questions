/**
 * 5/5/2018 - Brandon Gotay
 */

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column is set to 0
 */
public class Q7 {

    /**
     * Goes through the matrix and zeros out any rows containing a zero
     *
     * @param matrix - Matrix to perform the operations on
     */
    private static void zeroOutRows(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[i].length; j++)
                if(matrix[i][j] == 0) {
                    clearRow(matrix, i);
                    break;
                }
    }

    /**
     * Makes all entries in the row zero
     *
     * @param matrix - Matrix to perform the operations on
     * @param row - Row to zero out
     */
    private static void clearRow(int[][] matrix, int row) {
        if(row < 0 || row > matrix.length)
            return;

        for(int i = 0; i < matrix[row].length; i++)
            matrix[row][i] = 0;
    }

    /**
     * Prints out the given matrix
     *
     * @param matrix - The matrix to print
     */
    private static void print(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (int)(Math.random() * 10);

        print(matrix);
        zeroOutRows(matrix);
        print(matrix);
    }
}
