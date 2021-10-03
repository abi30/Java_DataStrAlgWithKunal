package day_2;

public class LeetCodePerfectSquare367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));

        int c=25;
        int r=(int) Math.sqrt(c);
        System.out.println(r);
    }

    public static boolean isPerfectSquare(int x) {


        if(x ==1)
            return true;
        int start = 1;
        int end = x;
        while(start <= end)
        {
            int mid = start + (end -start)/2;
            if(mid == x/mid && x%mid==0)
                return true;
            else if(mid < x/mid)
            {
                start = mid + 1;
                //ans = mid;
            }
            else
                end = mid - 1;
        }
        return false;

    }
}
