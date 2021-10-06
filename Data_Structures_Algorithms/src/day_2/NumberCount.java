package day_2;

public class NumberCount {

    public static void main(String[] args) {


        int count=factorial(0);
        System.out.println(count);
    }

    static  int factorial(int n){

                if (n == 0){

                    return 1;
                }
                else{

                return(n * factorial(n-1));
                }
            }


}
