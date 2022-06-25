package Udemy;

import java.util.Arrays;

public class quickSort {
    public static void main(String[]args){


//        int arr[] ={4,66546,2,5,3537,9,1,-34};
        int arr[] ={2,7,9,1,3,5};
//        swap(arr,2,5);
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        partition(arr,0, arr.length-1);

    }

    public static int partition(int arr[], int low , int high){

        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){

            while ((i<=high) && (arr[i]<=pivot)){
                i++;
            }
            while ((j>=low) && (arr[j]>=pivot)){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,low);

        return  j;

    }

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void quickSort(int arr[], int low , int high){

        if(low<high){
            int pivotPosition = partition(arr,low,high);
            quickSort(arr,low,pivotPosition-1);
            quickSort(arr,pivotPosition+1,high);
        }

    }



}
