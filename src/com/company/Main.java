package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int ARRAY_LENGTH = 5;

        int[] intArray = getIntegers(ARRAY_LENGTH);
        printArray(intArray);
        int[] array = new int[ARRAY_LENGTH];
        array = bubbleSortIntegers(intArray);
        printArray(intArray);
    }

    // fill the array of integers with user input
    public static int[] getIntegers(int length) {

        int[] array = new int[length];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < length; i++) {
            System.out.println("Enter an integer: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // print out the contents of the array
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("element[" + i + "]: " + array[i]);
        }
        System.out.println();
    }

    // sorts the passed in array from highest to lowest and returns a sorted array
    // O(n^2) speed
    public static int[] bubbleSortIntegers(int[] array) {

        int[] tempArray = new int[array.length];
        int temp;

        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
