package com.company;

public class InsertionSort {
    //int [] arr = {1,5,3,8,3,0,1,2,23,1,2,0};
    public static void insertionSort(int[] arr, int n){
        if(n<2)return;
        insertionSort(arr,n-1);

        int last = arr[n-1];
        int j = n-2;

        while(j>=0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
