package day_2;

import java.util.Arrays;

public class NumberSearch {

	public static void main(String[] args) {
		
		String s="ra2k3i2b";
        char[]ch = new char[number(s).length];
        ch=number(s);
        
       System.out.println(Arrays.toString(number(s)));
  }
	
	public static char[] number(String s){

//		char[] ch = s.toCharArray();
		char[] num=new char[s.length()];
		char[] error= new char[s.length()];
		for(int i=0;i<2;i++) {
			error[i]='0';
		}
	    
		int count=0;
		
		int j=0;
		
		for(int i=0; i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				num[j++]=s.charAt(i);
				count++;
			
			}
		
		}
		
		if(count==0) {
			return new char[]{'x'};
	
			}
		
		
	
     		return num;
 		
	}

}

//Character.isDigit(str.charAt(index))
//Character.isLetter(str.charAt(index))