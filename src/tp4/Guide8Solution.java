package tp4;

import tp4.answers.utils.MatrixContainer;

public class Guide8Solution implements Guide8 {

    // Exercise 5
    @Override
    public double[] exercise_5_a(double[][] A, double[] b) {
        int n = b.length;
        double aux;
        for (int k = 0; k < n ; k++){
            aux = A[k][k];
            for (int j = k; j < n; j++ )
                A[k][j]=A[k][j]/aux;
            b[k] = b[k]/aux;
            for (int i = k+1; i < n ; i++){
                aux = A[i][k];
                for (int j = k; j < n; j++)
                    A[i][j]=A[i][j] - aux*A[k][j];
                b[i]= b[i]-aux*b[k];
            }
        }
        double[] x = new double[n];
        double suma;
        x[n-1] = b[n-1];
        for (int i = n-2; i >= 0 ; i--){
            suma =0;
            for (int j = i+1; j < n; j++ )
                suma = suma + A[i][j]*x[j];
            x[i]= b[i]-suma;
        }
        return x;
    }

    @Override
    public double[] exercise_5_b(double[][] A, double[] b) {
        throw new UnsupportedOperationException("TODO");
    }


    // Exercise 6
    @Override
    public double[] exercise_6(double[][] A, double[] b) {
        throw new UnsupportedOperationException("TODO");
    }

    // Exercise 7
    @Override
    public double[] exercise_7(double[][] A, double[] b) {
        int n = b.length;
        double pivot;
        for (int k = 0; k < n ; k++){
            pivot = A[k][k];
            for (int j = k; j < n; j++ ) {
                if (j > k + 1) continue;
                A[k][j] = A[k][j] / pivot;
            }
            b[k] = b[k]/pivot;
            for (int i = k+1; i < n ; i++){
                pivot = A[i][k];
                for (int j = k; j < k+2; j++)
                    A[i][j]=A[i][j] - pivot*A[k][j];
                b[i]= b[i]-pivot*b[k];
            }
        }
        double[] x = new double[n];
        double sum;
        x[n-1] = b[n-1];
        for (int i = n-2; i >= 0 ; i--){
            sum =0;
            for (int j = i+1; j < n; j++ )
                sum = sum + A[i][j]*x[j];
            x[i]= b[i]-sum;
        }
        return x;
    }

    // Exercise 9
    @Override
    public double[][] exercise_9(double[][] A) {
        int n = A.length;
        double[][] b = new double[n][n*2];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                b[i][j] = A[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n*2; j++) {
                if(j == (i+n)) b[i][j] = 1;
            }
        }

        double[][] temp = new double[b.length][b[0].length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                temp[i][j] = b[i][j];
            }
        }

        for (int k = 0; k < n; k++) {
            double pivot = temp[k][k];

            for (int j = k; j < n*2; j++) {
                b[k][j] = temp[k][j]/pivot;
            }

            for (int i = 0; i < n; i++) {
                if(i == k) continue;
                for (int j = k; j < n*2; j++) {
                    b[i][j] = temp[i][j]-temp[i][k]*b[k][j];
                }
            }

            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    temp[i][j] = b[i][j];
                }
            }
        }

        double[][] c = new double[n][n];
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                c[i][k] = b[i][j+n];
                k++;
            }
        }
        return c;
    }

    @Override
    public MatrixContainer exercise_10(double[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

}