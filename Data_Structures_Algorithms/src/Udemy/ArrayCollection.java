package Udemy;

import java.util.ArrayList;
import java.util.Scanner;



public class ArrayCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		
		int[] array= new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
			
		}
		int maxNumber=max(array);
		int minNumber=min(array);
		
		System.out.println("max number is :"+maxNumber);
		System.out.println("min number is :"+minNumber);
	}
	
	
	public static int max(int[]array) {
	
		int max=0;
		for(int i=0;i<array.length;i++) {
			if(max <= array[i]) {
				max=array[i];
			}
		}
		
		return max;
	}
	public static int min(int[] array) {
		
		int min=0;
		for(int i=0;i<array.length;i++) {
			if(min >= array[i]) {
				min=array[i];
			}
		}
		
		return min;
	}

}
