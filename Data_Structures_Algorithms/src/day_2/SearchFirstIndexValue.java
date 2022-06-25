package day_2;

public class SearchFirstIndexValue {
    public static void main(String[]args){

//        int[] array = {4,5,7,8,9,10,14,17,21,1,2,3};
        int[] array = {4,5,7,8,9,10};

        System.out.println("hello " +findValue(array));

    }

    static int findValue(int[] array){
        return  binarySearchA(array,0,array.length-1);
    }

    static int binarySearchA(int[] arr,int start ,int end) {

//        start=0;
//        end =arr.length-1;

        if(start>end){
            return arr[0];
        }

        while(start <= end) {

            int mid=start+(end-start)/2;

            if(start == end){
                return arr[start];
            }

            if( (mid<end) && (arr[mid] > arr[mid+1])) {
                return arr[mid+1];
            }

            if((start<mid) && (arr[mid-1] > arr[mid])){
                return arr[mid];

            }


                if(arr[mid] < arr[end]) {
                    return binarySearchA(arr,start, mid-1);
                }
                if(arr[mid] > arr[end]){
                    return binarySearchA(arr,mid+1,end);
                }


        }

        return -1;


    }

}
