package practice.strings;

public class Integer_control {


public static boolean isInteger(Object object) {
	if(object instanceof Integer) {
		return true;
	} else {
		String string = object.toString();
		
		System.out.println(" this :"+string);
		try {
			Integer.parseInt(string);
		} catch(Exception e) {
			return false;
		}	
		
	}
  
   return true;
}
}
