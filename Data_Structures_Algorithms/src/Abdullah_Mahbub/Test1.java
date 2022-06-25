package Abdullah_Mahbub;


interface MyInterface {
    public void method1();
    public void method2();
}

class MyClass implements MyInterface {
    public void method1() {
        System.out.println( "method 1" );
    } public void method2() {
        System.out.println( "method 2" );
    }
}


public class Test1 {
    public static void main(String[] args) {


        MyClass c1 = new MyClass();
        c1.method1();
        c1.method2();




//        Scanner input= new Scanner(System.in);
//
//
//
//        System.out.print("enter your start value:");
//
//            int start=input.nextInt();
//
//        System.out.print("enter your end value:");
//
//            int end = input.nextInt();
//
//            int baseValue=1;
//
//
//        for (int i =1; i <4 ; i++) {
//            for (int j =1 ; j <4 ; j++) {// power start^1,start^2,start^3
//                baseValue= (int)(Math.pow(start,j));
//
//                System.out.print(" "+baseValue);
//
//
//            }
//            System.out.println("\n");
//            start++;
//            if(baseValue>end){
//                return;
//            }
//
//        }
    }

}
