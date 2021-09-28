package day_2;

import java.util.Arrays;

public class Linear_search {

	public static void main(String[] args) {
//		
		int[] arr= {12,33,45,43,76,21};
		
		int sucht=33;
		String str="I_love_bangladesh";
		char ch='x';
		String str2= "Abdulla_al_rakib";
		char ch2='r';
		System.out.println(searchChar2(str2,ch2));
		System.out.println("tergate character is "+searchChar(str,ch));
		System.out.println("tergate number is "+search(arr,sucht));
		
		System.out.println(Arrays.toString(str2.toCharArray()));
	}
	
	static boolean search(int[] arr,int sucht) {
		if(arr.length==0) {
			return false;
		}
		
		boolean statement=false;
		for(int i=0;i<arr.length;i++) {
			
			if(sucht==arr[i]) {
				statement =true;
			
				
			}
		}
		
		return statement;
	}
	
	
	static boolean searchChar2(String  str,char tergate) {
		if(str.length()==0) {
			return false;
		}
		
		boolean statement=false;
		for(char ch:str.toCharArray()) {
			
			if(ch==tergate) {
				statement =true;
			
				
			}
		}
		
		return statement;
	}
	static boolean searchChar(String  str,char ch) {
		if(str.length()==0) {
			return false;
		}
		
		boolean statement=false;
		for(int i=0;i<str.length();i++) {
			
			if(ch==str.charAt(i)) {
				statement =true;
			
				
			}
		}
		
		return statement;
	}
		
	}


