package tp3.utils;

import java.util.Arrays;

public class Vector {
    private final int[] vector;
    private int counter;

    public Vector(int[] vector) {
        this.vector = vector;
    }

    public int getValue(int i) {
        counter += 1;
        return vector[i];
    }

    public int getCounter() {
        return counter;
    }

    public int getVectorSize() {
        return vector.length;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vector)) {
            return false;
        }

        return Arrays.equals(vector, ((Vector) obj).vector);
    }
}
