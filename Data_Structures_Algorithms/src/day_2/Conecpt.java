package day_2;

public class Conecpt {

    public static void main(String[] args) {


        fun(5);
    }
    static void fun(int n){

        if(n==1) {
            return;
         }

        //fun(n--);
        fun(--n);
        System.out.println(n);

        // n-- or --n not seemlier

        }

}
