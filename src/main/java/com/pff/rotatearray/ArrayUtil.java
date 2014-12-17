package com.pff.rotatearray;

/**
 * Created by NicolaeRosca on 12/16/2014.
 */
public class ArrayUtil {

    /**
     * Rotate array inplace. Will modify array passed as parameter.
     *
     * @param array - to be rotated array
     * @param N
     */
    public static void rotateWithNInplace(int[] array, int N){
        int len = array.length;

        if(N <= len / 2)
            for(int i = 0; i < N; i++) {
                int Ni = N + i;
                int t = array[len - N + i];
                array[len - N + i] = array[Ni];
                array[Ni] = array[i];
                array[i] = t;
            }
        else
            move(array, N, array[0], N);
    }

    private static void move(int[] array, int N, int temp, int idx) {
        if (idx >= array.length) {
            idx = idx - array.length;
        }
        if (array[idx] == temp) {
            return;
        } else {
            int t = array[idx];
            array[idx] = temp;
            move(array, N, t, idx + N);
        }
    }

    /**
     * Return a new array with rotated elements.
     *
     * @param array - to be rotated array
     * @param N
     */
    public static int[] rotateWithN(int[] array, int N){
        int[] newArray = new int[array.length];

        for(int i = 0; i < newArray.length; i++) {
            if(i < N) {
                newArray[i] = array[newArray.length - N + i];
            } else {
                newArray[i] = array[i - N];
            }
        }

        return newArray;
    }
}
