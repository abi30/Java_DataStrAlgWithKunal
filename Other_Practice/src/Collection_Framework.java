import java.util.ArrayList;
import java.util.Iterator;


public class Collection_Framework {

	public static void main(String[] args) {
		
		
		ArrayList<String> num  =new ArrayList<>();
		num.add("3");
		num.add("54");
		
		//System.out.println("num : "+num);
		
		
		/*for(int temp :num) {
			System.out.println("ArrayList: "+temp);
		}*/
		
	Iterator itr=  num.iterator(); 
	while (itr.hasNext()) {
		
		System.out.println("ArrayList : "+itr.next());
	}
	System.out.println( "Arrayindex number : "+num.size());
	}

}
