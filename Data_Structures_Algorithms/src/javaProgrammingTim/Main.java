package javaProgrammingTim;

import java.util.Arrays;
import  java.util.Scanner;
public class Main {

    //private  static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {


        /*
        int [] myIntegers=getIntegers(6);

        int[] sorted = sortIntegers(myIntegers);
        PrintArray(sorted);
        */

        int [] myArray= new int[5];
         modifyArray(myArray);
        System.out.println(Arrays.toString(myArray));

    }


    public static  int[] getIntegers(int capacity){

        Scanner scanner =new Scanner(System.in);
        int arr[]=new int[capacity];
        System.out.println("Enter "+ capacity + " integer values:\r");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        return arr;
    }
    public  static void PrintArray(int [] arr){


        for (int i = 0; i < arr.length; i++) {

            System.out.println("Element "+i+" contents "+ arr[i]);
        }
    }
    public static int[] sortIntegers(int [] unsortedArray){

       //int[] sortedArray= new int[unsortedArray.length];
        //for (int i = 0; i < unsortedArray.length; i++) {
         //   sortedArray[i]=unsortedArray[i];
       // }
        int [] sortedArray= Arrays.copyOf(unsortedArray,unsortedArray.length);

        boolean flag= true;
        int temp;


        while (flag){
            
            flag=false;

            for (int i = 0; i < sortedArray.length-1; i++) {


                  //i=0 -> 2,9,21,3,12->9,2,21,3,12 true.
                  //i=1 -> 9,2,21,3,12->9,21,2,3,12 true.
                  //i=2 -> 9,21,2,3,12->9,21,3,2,12 true.
                  //i=3 -> 9,21,3,2,12->9,21,3,12,2 true.

                //---------------------------------------- agin while loop invoke

                  //i=0 -> 9,21,3,12,2->21,9,3,12,2 true.
                  //i=1 -> 21,9,3,12,2->21,9,3,12,2
                  //i=2 -> 21,9,3,12,2->21,9,12,3,2 true.
                  //i=3 -> 21,9,12,3,2->21,9,12,3,2
                //---------------------------------------- agin while loop invoke
                  //i=0 -> 21,9,12,3,2->21,9,12,3,2
                  //i=1 -> 21,9,12,3,2->21,12,9,3,2 true.
                  //i=2 -> 21,12,9,3,2->21,12,9,3,2
                  //i=3 -> 21,12,9,3,2->21,12,9,3,2
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i+1];
                    sortedArray[i+1]=sortedArray[i];
                    sortedArray[i]=temp;
                    flag=true;
                }

            }
            
            
        }


        



        return sortedArray;
    }

    private static void modifyArray(int [] array){

        array[0]=4;
        array  = new int[] {1,2,3,4,5};


    }



}
