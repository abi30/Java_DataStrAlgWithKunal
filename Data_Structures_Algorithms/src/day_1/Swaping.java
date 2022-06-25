package day_1;

public class Swaping {
    public static void main(String[] args) {


        int a =11;
        int b = 21;

        int [] array={5,4,3,7,1,8};

        swap(a,b);
        System.out.println(a+","+b);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        //System.out.println(a+","+b);
    }
}
