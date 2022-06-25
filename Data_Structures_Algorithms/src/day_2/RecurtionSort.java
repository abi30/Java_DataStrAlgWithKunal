package day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecurtionSort {

    public static void main(String[] args) {


        int [] array={5,5,7,5,12,3,5};
        int [] array1={5,5,7,5,12,7,1,3,5,7};

        //int [] array2= {1,10,16,23,29,35};
        //int target= 27;
        //int target1= 19;
        //System.out.println(Arrays.toString(targetIndex(array2,target)));


        System.out.println();

        //System.out.println(isItAssendingArray(array,0));
        //System.out.println(targetIndex_v1(array2,target1,0));

//        targetIndexes(array,5,0,list);

//        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(FindIndex(array,5,0,list1));
        System.out.println(FindIndexForLoop(array1,7 ,list2));
    }

     static boolean isItAssendingArray(int[]array,int index){

        if(index==array.length-1){
            return true;
        }

        return array[index]<array[index+1] && isItAssendingArray(array,index+1);

    }



    static  int [] targetIndex(int [] array,int target){
        int first=0;
        int last=array.length-1;
        //array2= {4,1,6,3,9,5};
        for (int i = first; i < array.length; i++) {
            for (int j = last; j >0 ; j--) {
                if(array[first]+array[last]==target){
                    return  new int[]{first,last};
                }

                if((array[first]+array[last])<target){
                    first++;
                }else {
                    last--;
                }
            }

        }
        return new int[] {-1,-1} ;

    }


    // with out return value find the target value if there more then on value
    //static void targetIndex_v1(int [] array,int target,int index){

    //   if(index==array.length){
    //       return;
    //   }
    //   if((array[index]==target) && index<array.length) {
    //       list.add(index);
    //   }
    //    targetIndex_v1(array,target,index+1) ;



    //}

//    static ArrayList<Integer> list = new ArrayList<>();


    // recurstion function
    public static ArrayList<Integer> FindIndex(int[] array,int target,int index,ArrayList<Integer> list){

        if(index == array.length){
        return list;
        }
        if (array[index]==target) {
            list.add(index);
        }
        return FindIndex(array,target,index+1,list);

    }

    // for while loop

    public static ArrayList<Integer> FindIndexForLoop(int[] arr, int target ,ArrayList<Integer> list){

        if(arr.length==0){
            return  list;
        }
        int i=0;
        while ( i <arr.length){

            if(arr[i]==target){
                list.add(i);
            }
            i++;
        }
        return list;
    }




}
