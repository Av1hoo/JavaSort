package com.company;

public class MeregeSort {

    public static void meregeSort(int[] arr, int left, int right){
        int mid;
        if (left < right){
            mid = (left+right)/2;
            meregeSort(arr,left,mid);
            meregeSort(arr,mid+1,right);

            merege(arr,left,mid,right);
        }
    }
    private static void merege(int[] arr, int left, int mid, int right){
        int low = mid - left + 1;
        int high = right - mid;

        int[] L = new int[low];
        int[] R = new int[high];

        int i, j = 0;
        for (i = 0; i < low; i++) {
            L[i] = arr[left + i];
        }
        for (j = 0; j < high; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int k = left;
        i = 0;
        j = 0;

        while (i < low && j < high){
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < low){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < high){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
