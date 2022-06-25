package javaProgrammingTim;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.print("Enter count : ");
        int count=scanner.nextInt();
        int [] myArray= readIntegers(count);
        System.out.println(Arrays.toString(myArray));
        System.out.println("minimum value of this array : "+findMin(myArray));

        reverse(myArray);
        System.out.println("after modify"+Arrays.toString(myArray));


    }

    private  static int[] readIntegers(int count){

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number : ");
            int number=scanner.nextInt();
            scanner.nextLine();
            array[i]=number;
        }

        return  array;
    }

    private static int findMin(int [] array){

        int min=Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            if(min>array[i]) min=array[i];

        }
     return min;
    }


    private static void reverse(int [] array){

        int maxIndex=array.length-1;
        int halfLength=array.length/2;


        for (int i = 0; i < halfLength; i++) {
            int temp=array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }

    }

}
