package com.epam.javatrainings.array;

public class ArrayUtil {

    /**
     * Sorts the array elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the array
     */
    int array[] = { 3,7,2,5,4,6,8,9,11,12 };
    public void sortByOddAndEven(int[] array) {

        int temp = 0;
        int k = 0;
        switch (array[0] % 2)
        {
            case 0:
                for (int i = 1; i < 10; i++)
                    if (array[i] % 2 == 0 && (i + 1) % 2 == 0)
                    {
                        temp = array[i];
                        k = i + 1;
                        do {
                            array[i] = array[k];
                        } while ((array[i] % 2 != 1) && (k < 10));
                        array[k] = temp;
                    }
                    else
                    if ((array[i] % 2 == 0) && (i % 2 == 0))
                    {
                        temp = array[i];
                        k = i;
                        do
                        {
                            k++;
                            array[i] = array[k];
                        } while ((array[i] % 2 != 1) && (k < 10));
                        array[k] = temp;
                    }
            case 1:
                for (int i = 1; i < 9; i++)
                    if (array[i] % 2 == 1 && i % 2 == 1)
                    {
                        temp = array[i];
                        k = i;
                        do
                        {
                            k++;
                            array[i] = array[k];
                        } while ((array[i] % 2 != 0) && (k < 10));
                        array[k] = temp;
                    }
                    else
                    if ((array[i] % 2 == 0) && (i % 2 == 0))
                    {
                        temp = array[i];
                        k = i;
                        do
                        {
                            k++;
                            array[i] = array[k];
                        } while ((array[i] % 2 != 1) && (k < 10));
                        array[k] = temp;
                    }
        }
    }

    /**
     * Return maximum element from given array
     */
    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < 10; i++)
        {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Return minimum element from given array
     */
    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < 10; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;

    }

    /**
     * Calculates the sum of specified array  elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
        int sum = array[0];
        for (int i = 1; i < 10; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Revers given array
     * Example:
     * Given array [2,5,7,3,2,6]
     * Expected array [6,2,3,7,5,2]
     */
    public static int[] reverse(int[] array) {
        int temp=array[i];
        for (int i = 0,j=0; i<5,j>4; i++,j--) {
            array[i]=array[j];
            array[j]=temp;
        }
        return array;
    }

    /**
     * Prints all elements in an array.
     *
     * @param array the array to print
     */
    public static void print(int[] array) {
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }


}