package day_2;

public class OddEven {
    public static void main(String[] args) {

//        int n = 545;
        int[] array={2,3,1,2,4,1,3,6,4};

        System.out.println(ans(array));
//        System.out.println(isOddNumber(n));
    }
//    public  static  boolean isOddNumber(int n){
//        return  (n & 1)==1;
//    }


//    very very important code to find an unique number.....

    public static int ans(int [] array){
        int unique=array[0];

        for (int i = 1; i < array.length; i++) {


            unique  = unique ^ array[i];
        }


        return unique;
    }
}
