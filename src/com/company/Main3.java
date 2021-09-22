package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Please Enter your name :");
        String name=scanner.nextLine();

        System.out.println("please enter your Year of birth:");
        boolean hasNextInt=scanner.hasNextInt();

        System.out.println("Hello ! "+name);
        if(hasNextInt){
            int yearOfBirth=scanner.nextInt();
            int age=2021-yearOfBirth;
            if(age > 0 && age < 100){
                System.out.println("you are "+age +" years old");

            }else{
                System.out.println("Invalid year of birth!!");
            }

        }else {
            System.out.println("Invalid year of birth!!");
        }

        scanner.close();
    }


}
