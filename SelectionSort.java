package com.company;

public class SelectionSort {

    public static void selectionSort(int[] arr, int n){
        if(n >= arr.length) return;
        int low = n;
        for(int i = n+1; i<arr.length;i++){
            if(arr[i] < arr[low]){
                low = i;
            }
        }
        int tmp = arr[n];
        arr[n] = arr[low];
        arr[low] = tmp;
        selectionSort(arr, n+1);
    }
}
