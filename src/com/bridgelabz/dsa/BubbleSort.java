package com.bridgelabz.dsa;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {5, 9, 2, 4, 1, 3};
        System.out.println("Array list is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);
        System.out.println("Array after Bubble Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
        public static void bubbleSort( int[] arr){
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }


}
