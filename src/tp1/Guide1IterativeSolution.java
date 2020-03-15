package tp1;

import java.util.List;

public class Guide1IterativeSolution implements Guide1 {

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
        int result = 0;
        for (int i = 1; i <= n ; i++) {
            result+= i*(i+1);
        }
        return result;
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
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result*2;
        }
        return result;
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
        String numberString = ((Integer)n).toString();
        int counter = 0;
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '0') counter++;
        }
        return counter;
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
        if (isPrime(n)) return n;
        int prime = n;
        for (int i = 0; i >=0; i++) {
            prime++;
            if(isPrime(prime)) return prime;
        }
        return prime;

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
        int result = coefs[coefs.length-1];
        for (int i=coefs.length-2; i>=0; i--)
            result = result*n + coefs[i];
        return result;
    }
}
