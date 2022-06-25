package day_2;

public class SplitArrayLeetcode410 {

    public static void main(String[] args) {

        int []arr={7,2,5,10,8};
        int m=2;
        int output=splitArray(arr,m);
        System.out.println(output);

    }


    public static int splitArray(int[] nums, int m) {
        int start=0;
        int end =0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]);
            end +=nums[i];

        }

        // binaray search
        while (start<end){
            // try for the middle as potential ans
            int mid= start+(end-start)/2;
            // calculate how many pieces you can divide theis in with this max sum
            int sum= 0;
            int pieces=1;
            for ( int num : nums) {
                if (sum+num >mid){
                    // you cannot add this index value in this subarray make new one
                    // say you add this num in new subarray then sum =num
                    sum= num;
                    pieces++;
                }else {
                    sum+=num;
                 }
                }
            if(pieces>m){// 3>2
                start=mid+1;

            }else {
                end=mid;
            }

            }


            return end;// here start== end
        }
}
