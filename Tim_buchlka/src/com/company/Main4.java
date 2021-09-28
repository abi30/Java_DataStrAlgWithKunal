package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int counter=0;
        int sum=0;
        while (true){
        int order=counter+1;
        System.out.println("Enter number #"+order+":");
        boolean inAnInt=scanner.hasNextInt();
        if(inAnInt){
        int number = scanner.nextInt();
         counter++;
         sum+=number;
         if(counter==10){
             break;
         }

        }else
        {
            System.out.println("Invalid number!");
          //  break;
        }
            scanner.nextLine();// handle end of line (enter key)!!

        }
        System.out.println("sum :"+sum);
        scanner.close();
    }
}
