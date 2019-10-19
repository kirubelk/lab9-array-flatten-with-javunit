package edu.mum.junit.arrayflattener;

import java.util.Arrays;

public class ArrayFlattener {

    public int[] ArrayFlattener(int[][] array) {
        if (array == null) {
            return null;
        }

        int[] flatten = Arrays.stream(array).flatMapToInt(Arrays::stream).toArray();
        return flatten;

    }
}
