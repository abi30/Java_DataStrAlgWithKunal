package day_2;

public class Leetcode69Sqrt {
    public static void main(String[] args) {

        System.out.println(mySqrt(1));

    }

    // X= 9;
    //ans =3;
    // 1,2,3,4,5,6,7,8,9
    public static int mySqrt1(int x){

        if(x==0){
            return 0;
        }
        int s=1;
        int e=x/2;
        int sqrt=s+(e-s)/2;
        while (s<=e){
            if(sqrt==x/sqrt){
                return  sqrt;
            }else if (sqrt<x/sqrt){
                s= sqrt+1;
            }else {
                e= sqrt-1;
            }
            sqrt=s+(e-s)/2;

            if (sqrt > x/sqrt){
                return sqrt-1;
            }else if (sqrt<x/sqrt){
                return sqrt+1;
            }else {
                return sqrt;
            }


        }
        return sqrt;

    }
    public static int mySqrt(int x) {
        if(x < 2)
            return x;
        int ans = 0;
        int start = 1;
        int end = x;
        while(start <= end)
        {
            int mid = start + (end -start)/2;
            if(mid == x/mid)
                return mid;
            else if(mid < x/mid)
            {
                start = mid + 1;
                ans = mid;
            }
            else
                end = mid - 1;
        }
        return ans;
    }

}
