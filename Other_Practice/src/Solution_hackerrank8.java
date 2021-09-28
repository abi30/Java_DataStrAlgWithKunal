

import java.util.*;
public class Solution_hackerrank8 {

	


	    public static void main(String []args){
	      

	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        in.close();
	        int max_one=0;
	        int count_one=0;
	        
	          char [] binaryArray= Integer.toBinaryString(n).toCharArray();
	        
	        for(int i = 0; i <binaryArray.length; i++){
	           
	        	if (binaryArray[i]=='1') count_one++;
	        	else count_one=0;
	        	if (count_one>max_one) {
	        		max_one=count_one;
	        	}
	        }
	       
	        System.out.println(max_one);      
	       
	    }
	}


