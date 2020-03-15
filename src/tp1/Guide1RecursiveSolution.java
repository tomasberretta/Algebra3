package tp1;

import java.util.List;

public class Guide1RecursiveSolution implements Guide1 {

    @Override
    public int exercise_1_a(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int p, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_d(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_e(int n) {
        while (n>0) {
            return n * (n + 1) + exercise_1_e(n - 1);
        }
        return 0;
    }

    @Override
    public int exercise_1_f(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_a(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_b(int n) {
        while(n>0){
            return 2*(exercise_2_b(n-1));
        }
        return 1;
    }

    @Override
    public int exercise_2_c(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_d(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_3(int n) {
        String nString = Integer.toString(n);
        return countCeros(nString, nString.length());
    }

    private int countCeros(String nString, int index) {
        while (index > 0){
            if(nString.charAt(index-1) == '0'){
            return 1 + countCeros(nString, index-1);
            }
            return countCeros(nString, index-1);
        }
        return 0;
    }

    @Override
    public boolean exercise_4(int[] array) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_5(int[] array, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_6_b_i(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_6_b_ii(int n) {
        //todo
        if(isPrime(n)) return n;
        return exercise_6_b_ii(n+1);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int exercise_6_b_iii(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<Integer> exercise_6_b_iv(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_8(int[] coefs, int n) {
        //todo
        return HornerR(coefs, coefs.length - 1, n, 0);
    }
    int HornerR( int a[], int n, int x, int index )
    {
        if (index==n) return a[n];
        else
            return x*HornerR(a,n ,x,index+1) + a[index];
    }
}
