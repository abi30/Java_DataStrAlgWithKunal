package Udemy;

import java.util.Arrays;
import java.util.Random;

public class QuickSortNew {

    public static void main(String[]args){

        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }


        System.out.println("before sorting :");
        System.out.println(Arrays.toString(arr));

        System.out.println("after sorting :");
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort( int arr[],int lowIndex,int highIndex){

        if(lowIndex>=highIndex){
            return;
        }
   /*
   * choosing the pivot
   * */
   //  int pivot = arr[highIndex];

    /*
    * when we are interested to use the random choosing pivot then use this function
    * what I put it down bellow
    *
    * */
        int pivotIndex = new Random().nextInt(highIndex-lowIndex)+lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr,pivotIndex,highIndex);

        //--------------------
        int leftPoint = partition(arr, lowIndex, highIndex, pivot);
        //----------------
//       return  leftPoint;
        // call the first part of the given array
        quicksort(arr,lowIndex,leftPoint-1);
        // call the second part of the given array
        quicksort(arr,leftPoint+1,highIndex);
    }

    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPoint = lowIndex;
        int rightPoint = highIndex;

        while (leftPoint < rightPoint) {

            while ((arr[leftPoint] <= pivot) && (leftPoint < rightPoint)) {
                leftPoint++;
            }
            while ((arr[rightPoint] >= pivot) && (leftPoint < rightPoint)) {
                rightPoint--;
            }
            swap(arr, leftPoint, rightPoint);
        }
        swap(arr, leftPoint, highIndex);
        return leftPoint;
    }

    private static void swap(int arr[],int lowIndex,int highIndex){

        int temp = arr[lowIndex];
        arr[lowIndex] = arr[highIndex];
        arr[highIndex] = temp;
    }
    public static void quicksortOwn( int arr[],int lowIndex,int highIndex){

        if(lowIndex>=highIndex){
            return;
        }

        int pivot = arr[highIndex];

        //--------------------
        int leftPoint = lowIndex;
        int rightPoint = highIndex;

        while (leftPoint<rightPoint){

            while ((arr[leftPoint]<=pivot) && (leftPoint<rightPoint)){
                leftPoint++;
            }
            while ((arr[rightPoint]>=pivot) && (leftPoint<rightPoint)){
                rightPoint--;
            }
            swap(arr,leftPoint,rightPoint);
        }
        swap(arr,leftPoint,highIndex);
        //----------------
//       return  leftPoint;
        quicksort(arr,lowIndex,leftPoint-1);
        quicksort(arr,leftPoint+1,highIndex);
    }

}
