package day_2;

public class LeetCode33_extra {



        public static void main(String[] args) {


            int[] arr={4,5,6,7,0,1,2};
            int index= search(arr,1);
            System.out.println(index);
        }

        public static int  findPrivot(int[]arr){
            int start=0;
            int end= arr.length-1;
            while (start<=end){
                int mid = start+(end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]){
                    return mid;
                }
                if(mid>start && arr[mid]<arr[mid-1]){
                    return mid-1;
                }
                if(arr[start]>=arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }
            return -1;
        }

        public static int search(int[] arr, int target) {


            int pivot=findPrivot(arr);

            if(pivot==-1){
                return  binarySeach(arr,target,0,arr.length-1);
            }
            if(arr[pivot]==target) return pivot;

            if(target>=arr[0]){
                return binarySeach(arr,target,0,pivot-1);
            }else {
                return binarySeach(arr,target,pivot+1,arr.length-1);
            }


          /*  if(arr.length==1){
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


           */
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


