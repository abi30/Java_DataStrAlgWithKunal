package day_2;

public class LetterCelining {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // search the index of the target value...

        char[] arr= {'a','b','c','m','j','x'};

        char target='j';
        char ans=letterOfCelining(arr,target);
        System.out.println(ans);

    }

    static char letterOfCelining(char[] arr,char target) {

        int start=0;
        int end =arr.length-1;

        while(start<=end) {

            int mid=start+(end-start)/2;

            if(target<arr[mid]) {
                end=mid-1;

            }else{

                start=mid+1;
            }

        }

        return arr[start % arr.length];


    }

}
