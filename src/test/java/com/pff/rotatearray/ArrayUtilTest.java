package com.pff.rotatearray;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by NicolaeRosca on 12/17/2014.
 */
public class ArrayUtilTest {

    @Test
    public void testRotateArrayInplace() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedArray = new int[]{5, 6, 1, 2, 3, 4};

        ArrayUtil.rotateWithNInplace(testedArray, 2);
        assertTrue("Arrays don't match", Arrays.equals(expectedArray, testedArray));
    }

    @Test
    public void testRotateArrayInplace_N_more_half_length() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedArray = new int[]{2, 3, 4, 5, 6, 1};

        ArrayUtil.rotateWithNInplace(testedArray, 5);
        assertTrue("Arrays don't match", Arrays.equals(expectedArray, testedArray));
    }

    @Test
    public void testRotateArrayInplace_N_half_length() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedArray = new int[]{4, 5, 6, 1, 2, 3};

        ArrayUtil.rotateWithNInplace(testedArray, 3);
        assertTrue("Arrays don't match", Arrays.equals(expectedArray, testedArray));
    }

    @Test
    public void testRotateArrayInplace_N_0() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6};

        ArrayUtil.rotateWithNInplace(testedArray, 0);
        assertTrue("Arrays don't match", Arrays.equals(expectedArray, testedArray));
    }

    @Test
    public void testRotateArrayInplace_N_odd() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expectedArray = new int[]{4, 5, 6, 7, 1, 2, 3};

        ArrayUtil.rotateWithNInplace(testedArray, 4);
        assertTrue("Arrays don't match", Arrays.equals(expectedArray, testedArray));
    }

    @Test
    public void testRotateArrayInplace_N_odd_2() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expectedArray = new int[]{5, 6, 7, 1, 2, 3, 4};

        ArrayUtil.rotateWithNInplace(testedArray, 3);
        assertTrue("Arrays don't match", Arrays.equals(expectedArray, testedArray));
    }

    @Test
    public void testRotateArrayExtraMemory() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedArray = new int[]{5, 6, 1, 2, 3, 4};

        int[] result = ArrayUtil.rotateWithN(testedArray, 2);

        assertTrue("Arrays don't match", Arrays.equals(expectedArray, result));
    }

    @Test
    public void testRotateArrayExtraMemory_take2() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedArray = new int[]{2, 3, 4, 5, 6, 1};

        int[] result = ArrayUtil.rotateWithN(testedArray, 5);

        assertTrue("Arrays don't match", Arrays.equals(expectedArray, result));
    }

    @Test
    public void testRotateArrayExtraMemory_N_equals_length() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6};

        int[] result = ArrayUtil.rotateWithN(testedArray, 6);

        assertTrue("Arrays don't match", Arrays.equals(expectedArray, result));
    }

    @Test
    public void testRotateArrayExtraMemory_N_0() {
        int[] testedArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6};

        int[] result = ArrayUtil.rotateWithN(testedArray, 0);

        assertTrue("Arrays don't match", Arrays.equals(expectedArray, result));
    }
}
