package day_2;

public class MaxWater {
    public static void main(String[] args) {

    int[] arr={1,8,6,2,5,4,8,3,7};
    int ans=maxArea(arr);
    System.out.println(ans);
    }


    public static int maxArea(int[] height) {

        // two pointer approch..
        int point1=0;
        int point2=height.length-1;

        int maxArea=Integer.MIN_VALUE;

        while (point1<point2){

            maxArea=Math.max(maxArea,(Math.min(height[point1],height[point2])*(point2-point1)));
            if(height[point1]>=height[point2]){
                point2--;
            }else {
                point1++;
            }

        }
        return maxArea;
    }

}
