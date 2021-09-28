package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class RichestNumber {

	public static void main(String[] args) {
		
		
		
		int arr[][]= new int[3][3];
		
		Scanner input= new Scanner(System.in);
		//System.out.println("Enter you value :");

	   
	    
	    for(int row=0;row<arr.length;row++) {
	    	for(int col=0;col<arr[row].length;col++) {
	    		 
	    		
	    		arr[row][col]=input.nextInt();
	    		
	    	}
	    	
	    	
	    }
	    
	    input.close();	
	   /* for(int row =0; row<arr.length;row++) {
	    	System.out.println(Arrays.toString(arr[row]));
	    	
	    }*/
	    for(int[]x:arr) {
	    	System.out.println(Arrays.toString(x));
	    	
	    }
	 	
	}

}


