package day_2;

public class NumberExample {
    public static void main(String[] args) {
// write a function that takes in a number and prints it

        print(1);
    }
    static  void print(int n){
        if(n<6) {
            System.out.println(n);
            print(n + 1);
        }
        return;


        // base condition
       /* if(n==6){
            return;
        }
        // what is printing
        System.out.println(n);
        // recursive call
        // if you are calling a function again and again
        print(n+1);
        */
     }

}
