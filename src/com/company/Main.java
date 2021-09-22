package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

     System.out.println("Please Enter your name :");
     String name=scanner.nextLine();
     System.out.println("please enter your Year of birth:");
     int yearOfBirth=scanner.nextInt();
     int age=2021-yearOfBirth;
     System.out.println("Hello ! "+name);
     System.out.println("you are "+age +" years old");

     scanner.close();
    }




}
