package day_2;

public class RBS {

    public static void main(String[] args) {

        int[] arr={4,5,6,7,0,1,2};
        int index= search(arr,5);
        System.out.println(index);
    }

static int findPrivot(int[] arr){


        return  0;
}

    public static int search(int[] arr, int target) {


        if(arr.length==1){
            if(arr[0]==target){
                return 0;
            }else{
                return -1;
            }

        }
        int i;
        int n=arr.length-1;
        for (i=1;i<n+1;i++){
            if(arr[i]<arr[i-1]){
                break;
            }
        }
        int mid=i-1;
        int start=0;
        if(target>=arr[start] && target<=arr[mid]){
            return binarySeach(arr,target,start,mid);
        }else {
            return binarySeach(arr,target,i,n);
        }
    }
    static int binarySeach(int[] arr,int target,int start,int end) {

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
