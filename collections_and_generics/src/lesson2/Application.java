package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
	
List<String>animals= new ArrayList<String>();

animals.add("Lion");
animals.add("Cat");
animals.add("Dog");
animals.add("Bird");

//for(int i=0;i <animals.size();i++) {
//	System.out.println(animals.get(i));
//	
//}
//for (String value : animals) {
//	System.out.println(value);
//}


List<Vehicle>vehicles=new ArrayList<Vehicle>();
Vehicle vehicle1=new Vehicle("honda","Accord",1200,false);
vehicles.add(new Vehicle("toyota","chert",2200,false));
vehicles.add(vehicle1);
vehicles.add(new Vehicle("jeep","Wrangler",2500,true));

//for (Vehicle car :vehicles) {
//	System.out.println(car);
//	
//}

printElements(vehicles);
printElements(animals);
	}
	
	public static void printElements(List somelist) {
		for (int i =0;i<somelist.size();i++) {
			System.out.println(somelist.get(i));
		}
		
	}

}
