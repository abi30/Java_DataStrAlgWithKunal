package day_1;

public class WrapperExample {

    public static void main(String[] args) {
       int a=12;
        int b=21;
        int num = 43;
        int temp;

        //---------------------
        temp=a;
        a=b;
        b=temp;

        //--------------------
        System.out.println(a+" , "+b);
        System.out.println(a+" , "+b);

       final A abdulla= new A("rakib");
        abdulla.name ="humayra";

        System.out.println(abdulla.name);
        A obj = new A("kashogi abdullah");
        System.out.println(obj);

      /*
        for (int i = 0; i <100 ; i++) {
            obj=new A("Rendom name");
        }*/
    }

    static void swaing(int a,int b){
        int temp;
         temp=a;
         a=b;
         b=temp;

    }

}

class A{
    final int num=21;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destoryed!");;
    }
}
