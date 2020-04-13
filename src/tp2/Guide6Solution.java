package tp2;

import tp2.utils.Infraction;
import tp2.utils.Survey;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Tomas Bruno, Tomas Berretta
 */

public class Guide6Solution implements Guide6 {

    @Override
    public int exercise_1_a(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int[] a, int value) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_d(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_e(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_f(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_g(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_h(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_i(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_j(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_k(int[] v, int[] w) {
        int result = 0;
        for (int i = 0; i < v.length; i++) {
            result += v[i] * w[i];
        }
        return result;
    }

    @Override
    public int[] exercise_2(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            int value = a[i];
            for (int j = 0; j < a.length; j++) {
                if(value < a[j]) counter++;
            }
            b[i] = counter;
        }
        return b;
    }

    @Override
    public boolean exercise_3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            int value = a[i];
            for (int j = 0; j < a.length; j++) {
                if(i != j) counter += a[j];
            }
            if(value == counter) return true;
        }
        return false;
    }

    @Override
    public boolean exercise_4(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<Integer> exercise_5_a(Infraction[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] infractionsPerMonth = getInfractionsPerMonth(a);
        int max = infractionsPerMonth[0];
        int index = 0;
        for (int i = 0; i < 12; i++) {
            if (max < infractionsPerMonth[i]) {
                max = infractionsPerMonth[i];
                index = i;
            }
        }
        infractionsPerMonth[index] = 0;
        result.add(index+1);
        final int MAXINFRACTIONS = max;
        for (int i = 0; i < 12; i++) {
            if (MAXINFRACTIONS == infractionsPerMonth[i]) {
                result.add(i+1);
            }
        }
        return result;
    }

    @Override
    public List<Integer> exercise_5_b(Infraction[] infraction) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] infractionsPerMonth = getInfractionsPerMonth(infraction);
        for (int i = 0; i < 12; i++) {
            if (infractionsPerMonth[i] == 0) {
                result.add(i+1);
            }
        }
        return result;
    }

    @Override
    public int exercise_5_c(Infraction[] infraction) {
        int[] infractionsPerMonth = getInfractionsPerMonth(infraction);
        int result = 0;
        for (int i = 0; i < 12; i++) {
            result += infractionsPerMonth[i];
        }
        return result;
    }

    public int[] getInfractionsPerMonth (Infraction[] infraction){
        int[] infractionsPerMonth = new int[12];
        for (int monthIndex = 0; monthIndex < 12; monthIndex++) {
            for (Infraction value : infraction) {
                if (value.monthNumber == monthIndex + 1) infractionsPerMonth[monthIndex] += value.numberOfInfractions;
            }
        }
        return infractionsPerMonth;
    }

    @Override
    public int[] exercise_6(int[] infraction) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public double exercise_7_a(Survey[] surveys) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public double exercise_7_b(Survey[] surveys) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_7_c(Survey[] surveys) {
        throw new UnsupportedOperationException("TODO");
    }
}
