import java.util.Scanner;

public class Uri_2786 {
	

		 
	   public static void main(String[] args)  {
	 
	 
	 int length,width;
	 Scanner sc =new Scanner (System.in);
	       length = sc.nextInt();
	       width  = sc.nextInt();
	       int typ1=(length*width);
	       typ1+=(length-1)*(width-1);
	       System.out.println(typ1);
	       
	       int typ2=0;
	       typ2+=(length-1)*2;
	        typ2+=(width-1)*2;
	        System.out.println(typ2);
	       
	    }

}
