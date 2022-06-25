package day_1;

import java.util.Arrays;

public class OOPNEWCOURSE {
    public static void main(String[] args) {


       Student abdulla= new Student(32,"Abdulla rakib",45.0f);


        System.out.println((abdulla.marks));
        System.out.println((abdulla.name));
        System.out.println((abdulla.rno));
        abdulla.print();
        abdulla.changName("humayra Akter");

        Student s1=new Student(abdulla);
        System.out.println(s1.name);

        Student rendom2= new Student();
        System.out.println(rendom2.name);
        System.out.println(rendom2.marks);

        Student remdom3=rendom2;

        System.out.println(remdom3.name);
        System.out.println(remdom3.marks);



    }
}
class Student{

    int rno;
    String name;
    float marks;

    Student(int rno,String name,float marks){
        this.name=name;
        this.rno=rno;
        this.marks=marks;

    }
    Student(){
        this(23,"rakin",65.9f);
    }
    Student(Student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;

    }
    void  print(){
        System.out.println("my namme is "+this.name);
    }

    void changName(String newName){
        this.name=newName;
        System.out.println("name change to "+this.name);
    }

}