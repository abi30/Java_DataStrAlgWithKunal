package Udemy;

import java.util.Arrays;

public class reverseMain {
    public static void main(String[] args) {

        int [] array= {3,4,9,2,5,7,8};

        reverse(array);

    }
    public static void reverse(int [] array){

        int maxLength= array.length-1;
        int halfLength=array.length/2;
        for (int i = 0; i < halfLength; i++) {
            int temp= array[i];
            array[i]=array[maxLength-i];
            array[maxLength-i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
