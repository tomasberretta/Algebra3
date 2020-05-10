package tp3;

import tp3.utils.Matrix;
import tp3.utils.MatrixMatrixOperation;
import tp3.utils.MatrixVectorOperation;
import tp3.utils.Vector;

import java.util.List;

public class Guide7Solution implements Guide7 {

    @Override
    public int exercise_1_a(int[][] A) {
        Matrix matrix = new Matrix(A);
        int result = 0;
        for (int i = 0; i < matrix.getRows(); i++) {
            result += matrix.getValue(i,i);
        }
        return result;
    }

    @Override
    public int exercise_1_b(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_c(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_d(int[][] A, int[] b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_e(int[][] A, int[][] B) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_f(int[][] A, int[][] B) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_g(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_h(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int exercise_1_i(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int[][] exercise_1_j(int[][] A, int c) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public boolean exercise_2_a(int[][] A) {
        Matrix matrix = new Matrix(A);
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                if(matrix.getValue(i,j) != matrix.getValue(j,i)) return false;
            }
        }
        return true;
    }

    @Override
    public boolean exercise_2_b(int[][] A) {
        Matrix matrix = new Matrix(A);
        for (int i = 0; i < matrix.getRows(); i++) {
            int diagValue = Math.abs(matrix.getValue(i,i));
            int rowValue = 0;
            for (int j = 0; j < matrix.getColumns(); j++) {
                if(i != j) rowValue += Math.abs(matrix.getValue(i,j));
            }
            if(diagValue <= rowValue) return false;
        }
        return true;
    }

    @Override
    public MatrixVectorOperation exercise_3_a_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_iii(MatrixMatrixOperation op) {
        int[][] result = new int[op.getMatrix1().getRows()][op.getMatrix1().getColumns()];
        for (int i = 0; i < op.getMatrix1().getColumns(); i++) {
            for (int j = 0; j < op.getMatrix1().getColumns(); j++) {
                if(j < i) continue;
                for (int k = 0; k <= j; k++) {
                    if(k<i)continue;
                    result[i][j] += op.multiplyPositions(i,k,k,j);
                }
            }
        }
        op.setResult(new Matrix(result));
        return op;
    }

    @Override
    public MatrixVectorOperation exercise_3_b_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_c_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_c_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_c_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_d_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_e(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<double[]> exercise_4(List<double[]> A) {
        throw new UnsupportedOperationException("TODO");
    }
}
