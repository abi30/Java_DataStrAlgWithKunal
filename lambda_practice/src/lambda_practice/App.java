package lambda_practice;

public class App {

	public static void main(String[] args) {

		
		Human tom= new Human ();
	    walker(tom);
		
		Robot wale= new Robot();
		walker(wale);
		
		walker(()->System.out.println("customize walker walking  01.."));
		
		Walkable aBlockOfCode= ()->{System.out.println("customize walker walking 02..");
				System.out.println("customize walker walking shlowly 03..");
				};
		
				walker(aBlockOfCode);
		
	}
	
	
public static void walker(Walkable walkableEntitiy) {
		walkableEntitiy.walk();
	}
	


}
