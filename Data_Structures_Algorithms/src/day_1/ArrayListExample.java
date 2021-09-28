package day_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		int[] arr =new int[3];
	
		ArrayList<ArrayList<Integer>>list = new ArrayList<>();
		
		//Initialization part
		 for(int i=0;i<3;i++) {
			list.add(new ArrayList<>());
			
		}
		 
		 //input
		 for(int i=0;i<3;i++) {
			 for(int j=0;j < 3;j++) {
				 list.get(i).add(in.nextInt());
			 }
		 }
		 
		 
		 System.out.println(list);
		
		
		 
		 for(int i=0;i<3;i++) {
				arr[i]=i;
				
			}
		 for(int i= 0;i<3;i++) {
			 
			 System.out.print(arr[i]+" ");
		 }
	}

}
