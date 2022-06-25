package day_2;

public class CountRotated {
    public static void main(String[] args) {

        int[] arr= {15,18,2,3,6,12};
        int[] arr1= {4,5,6,7,0,1,2};

        System.out.println(countRoted(arr1));


    }

    public static int countRoted(int[] arr){

        int end=arr.length-1;
        int start=0;
        int count=0;

        if (arr.length==1 || arr.length==0){
            return count;
        }

            for (int i = 0; i < arr.length-1; i++) {

                if(arr[end]<arr[start+i]){
                    count++;
                }

            }
            return count;

    }
}
