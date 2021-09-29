package day_2;
public class InfiniteArrayAmazone {
    public static void main(String[] args) {

        int[] arr={3,4,5,6,8,12,14,15,23,45,47,59,78,89,99,121,231,321,564};
        int target=47;

        System.out.println("index of element: "+ans(arr,target));
    }
    static  int ans(int[] arr,int target){
        int ans=-1;
        //first find the range
        // first start with a box of size 2
        int start=0;
        int end=1;
            // condition for the target to lie in the range
        while (target>arr[end]){
            int temp=end+1;// this is my new start
               //double the box value
              //end = lastEndIndexValue+(boxsize:[end-start]+1)*2
                end = end+(end-start)*2;
                start=temp;

        }

                return binarySeach(arr,target,start,end);

        }


    static int binarySeach(int[] arr,int target,int start,int end) {
    // start with the box of size 2


        while(start<=end) {

            int mid=start+(end-start)/2;

            if(target<arr[mid]) {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                // ans found
                return mid;
            }

        }

        return -1;


    }

}
