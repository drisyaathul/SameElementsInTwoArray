package com.bridgelabz;

import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] array1 = {10, 15, 12, 25, 35, 30};
        int[] array2 = {15, 8, 45, 40, 30, 18};

        System.out.println("Array1 = " + Arrays.toString(array1));
        System.out.println("Array2 = " + Arrays.toString(array2));

        for (int i=0; i<array1.length; i++) {
            for (int j=0; j<array2.length; j++) {
                if (array1[i] == array2[j]){
                    System.out.println("Duplicate Elements : "+array1[i] );
                }
            }
        }
    }
}