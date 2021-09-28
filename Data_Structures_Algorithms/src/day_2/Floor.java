package day_2;

public class Floor {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // search the index of the target value...

        int[] arr= {2,7,9,12,16,20};

        int target=19;
        int ans=floor(arr,target);
        System.out.println(ans);

    }

    // return the index: greatest number <= target
    static int floor(int[] arr,int target) {

        int start=0;
        int end =arr.length-1;

        if(arr.length==0 || target<arr[0]){
            return  -1;
        }

        while(start<=end) {

            int mid=start+(end-start)/2;

            if(target<arr[mid]) {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                return arr[mid];
            }

        }

        return arr[end];


    }
}
