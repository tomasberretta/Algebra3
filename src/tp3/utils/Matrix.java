package tp3.utils;

import java.util.Arrays;

public class Matrix {
    private final int[][] matrix;
    private int counter;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getValue(int i, int j) {
        counter += 1;
        return matrix[i][j];
    }

    public int getCounter() {
        return counter;
    }

    public int getRows() {
        return matrix.length;
    }

    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Matrix)) {
            return false;
        }

        return Arrays.equals(matrix, ((Matrix) obj).matrix);
    }
}
