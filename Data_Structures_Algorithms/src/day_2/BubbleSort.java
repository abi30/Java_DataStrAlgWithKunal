package day_2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int[]arr={5,4,3,2,1};

    bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[]arr){
        // [3,1,5,4,2]
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j]<arr[j-1]){
                    //sawp
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;


                }
            }
        }

    }
}
