package day_2;


import java.util.Arrays;
import java.util.stream.IntStream;

public class CountingSortAlgo {


    public static void main(String args[]) {
//      int[] data = { 4, 2, 2, 8, 3, 3, 1 };
//        int[] data = { -1, -2,-2,2,0,8,-3,3,1};
        int[] data = { 2,1,2,5,4};
//      int[] data = {5,2,7,4,21,2};
        int size = data.length;

        countSort(data, size);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));

    }


       static void countSort(int array[], int size) {
            int[] output = new int[size];

            //1.____ Find the largest element of the array
            int max = array[0];
            for (int i = 1; i < size; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            //2.____ Find the smallest element of the array
            int min = array[0];
            for (int i = 1; i < size; i++) {
                if (array[i] < min)
                    min = array[i];
            }

            int range = (max-min);
            //3._____ count array initialize with o value
            int[] count = new int[range+ 1];
           System.out.println(Arrays.toString(count));

            //4._____ Store the count of each element
            for (int i = 0; i < size; i++) {
                count[(array[i]-min)]++;
            }
           System.out.println(Arrays.toString(count));

            //5.______ Store the cumulative count of each array
            for (int i = 1; i <= range; i++) {
                count[i] += count[i - 1];
            }
           System.out.println(Arrays.toString(count));

            //6.______ put the value in the output array
           for (int i = 0; i < array.length; i++) {
               System.out.println("hello :"+count[(array[i]-min)]);
               count[array[i]-min]--;
               System.out.println("hello 2:"+count[(array[i]-min)]);
               output[count[array[i]-min]] = array[i];
           }
           System.out.println(Arrays.toString(output));


            //___optional________ Copy the sorted elements into original array
            for (int i = 0; i < size; i++) {
                array[i] = output[i];
            }
        }

    }

