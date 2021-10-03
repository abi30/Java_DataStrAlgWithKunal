package day_2;

public class LeetCode633 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2147483600));
    }
    public static boolean judgeSquareSum(int c) {

        if(c==0){
            return true;
        }

        long l=0;
        long r=(int) Math.sqrt(c);

        while (l<=r){
            long res=l*l+r*r;
         if(res<c){
             l++;
         }else if(res>c){
             r--;
         }else {
             return true;
         }

        }
        return false;

    }

//2147483600
}
