package com.victor.learn.algorithms;

public class TypicalArrayProcessingAlgorithms {
    
    //Max element of an array 
    public static double maxValueOf(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //Average of array values 
    public static double average(double[] array) {
        int n = array.length;
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/n;
    }

    //Copy of array 
    public static double[] copy(double[] array) {
        int n = array.length;
        double[] b = new double[n];
        for (int i = 0; i < array.length; i++) {
            b[i] = array[i];
        }
        return b;
    }

    //Reverse array 
    public static double[] reverse(double[] array) {
        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            double temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = {3.4, 5.6, 7.0, 4.5, 3.2, 1.0, 9.0, 10.8, 4.5, 60.4, 30.6, 100.0 };
        double[] arrayReversed = reverse(array);
        for (int i = 0; i < arrayReversed.length; i++) {
            System.out.println(array[i]);
        }
    }
}
