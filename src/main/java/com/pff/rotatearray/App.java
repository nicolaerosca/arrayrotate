package com.pff.rotatearray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * Created by NicolaeRosca on 12/17/2014.
 */
public class App {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("usage: java -jar jar_file inputFileName");
            return;
        }

        try {
            BufferedReader brIn = new BufferedReader(new FileReader(args[0]));

            String firstLine = brIn.readLine();
            int N = Integer.parseInt(firstLine);

            String[] arrayStr = brIn.readLine().split(" ");
            int[] array = new int[arrayStr.length];
            for (int i = 0; i < arrayStr.length; i++) {
                array[i] = Integer.parseInt(arrayStr[i]);
            }

            if (N > array.length) {
                System.out.println("N can not be more than array's length");
            } else {
                ArrayUtil.rotateWithNInplace(array, N);
                System.out.println(Arrays.toString(array));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
