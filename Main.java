package com.company;

import static com.company.HeapSort.heapSort;
import static com.company.InsertionSort.insertionSort;
import static com.company.MeregeSort.meregeSort;
import static com.company.SelectionSort.selectionSort;
import static com.company.BubbleSort.bubbleSort;

public class Main {

    public static void main(String[] args) {
        String space = "---------------------------------------------";
	    int [] arr = {1,5,3,8,3,0,1,2,-23,1,2,0};
        System.out.println(space);
        System.out.println("Merege sort - sort by split the array to smaller arrays of 2 or less elements, sort the, and then merege them into the original array. \nBefore:");
        display(arr);
        meregeSort(arr,0, arr.length-1);
        System.out.println("After:");
        display(arr);
        System.out.println("Time Complexity - O(n*log(n)) ");
        System.out.println(space);


        System.out.println("Heap sort - Heap sort is a comparison-based sorting technique based on Binary Heap data structure." +
                 " We repeat the same process for the remaining elements.\nBefore:");
        int [] arr5 = {1,5,3,8,3,0,1,2,-23,1,2,0};
        display(arr5);
        heapSort(arr5);
        System.out.println("After:");
        display(arr5);
        System.out.println("Time Complexity - O(n*log(n)) ");
        System.out.println(space);

        System.out.println("Insertion Sort - A sorting algorithm that places an unsorted element at its suitable place in each iteration.\nBefore:");
        int [] arr2 = {1,5,3,-8,3,0,1,2,23,1,-2,0};
        display(arr2);
        insertionSort(arr2,arr2.length);
        System.out.println("After:");
        display(arr2);
        System.out.println("Time Complexity - O(n) ");
        System.out.println(space);


        System.out.println("Bubble Sort - \nBefore:");
        int [] arr4 = {1,5,3,-8,3,0,1,2,23,1,-2,0};
        display(arr4);
        bubbleSort(arr4, arr4.length);
        System.out.println("After:");
        display(arr4);
        System.out.println("Time Complexity - O(n) ");
        System.out.println(space);

        System.out.println("Selection Sort - A sorting algorithm algorithm that sorts an array by repeatedly finding the minimum element and place it at the " +
                "arr[n] where n is the iteration number.\nBefore:");
        int [] arr3 = {1,5,3,-8,3,0,1,2,23,1,-2,0};
        display(arr3);
        selectionSort(arr3,0);
        System.out.println("After:");
        display(arr3);
        System.out.println("Time Complexity - O(n^2) ");

        System.out.println(space);
    }

    public static void display(int[] arr){
        System.out.print("[");
        int i =0;
        for(i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[i]);
        System.out.print("]\n");
    }
}
