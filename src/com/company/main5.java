package com.company;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=0;
        int max=0;


        while (true){
            System.out.println("enter number:");
            boolean isAnInt= scanner.hasNextInt();

            if(isAnInt){
                int number= scanner.nextInt();
                if(number>max){
                    max=number;
                }
                if(number<min){
                    min=number;
                }
            }else{
                break;
            }
        scanner.nextLine();
        }
        System.out.println("max= "+max+"min= "+min);

        scanner.close();
    }
}
