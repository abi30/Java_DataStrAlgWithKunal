package day_2;

public class Nto1 {









    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);

    }
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return (n * (factorial(n - 1)));

    }
    static int totalsum(int n){


        int rem=(n%10);

        if(n==0){
            return rem;
        }

        return (rem + totalsum(n/10));

    }

    static  int sum(int n){

        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }

    static  int prod(int n){

        if(n%10==n){
            return n;
        }
        return (n%10) * sum(n/10);
    }

    static int rev(int n){

    int digits=(int)Math.log10(n)+1;
    return  helper(n,digits);
    }

    static int helper(int n,int digits){

        if(n%10==n) return n;
        int rem=n%10;

           return rem*(int)Math.pow(10,(digits-1))+helper(n/10,digits-1);
    }



    static  int sum=0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem= n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }


    public static void main(String[] args) {


        // int var=factorial(5);
        // System.out.println(var);


        int value =numberOfSteps(45);
        System.out.println("count"+value);
        int rakib=3241;
        int rakiv=1234321;
        int abdulla=12030301;
        System.out.println(rev(rakib));
        rev1(rakiv);
        System.out.println(sum);;

        int v= countZero(abdulla,0);
      System.out.println(v);
    // System.out.println(count);
        System.out.println(palin(rakiv));

    }


    static boolean palin(int n){
        return( n==rev(n));
    }
   // static int count=0;
    static int countZero(int n,int count){


        if(n%10==0) {
            count++;
        }
        if(n/10==0){
            return count;
        }

        n=n/10;

        return countZero(n,count);
    }


    public static int numberOfSteps(int num) {

        return calculateCount(num,0);

    }
    public static int calculateCount(int num, int count){

        if(num==0)return count;

        if(num%2!=0){
            return calculateCount(num-1,count+1);
        }else{
            return calculateCount(num/2,count+1);
        }

    }







}