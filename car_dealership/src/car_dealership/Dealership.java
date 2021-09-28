package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1= new Customer();
		
		cust1.setName("abi");
		cust1.setAdress("barishal str.");
		cust1.setCashOnHand(12000);
		
		
		Vehicle vehicle=new Vehicle("toyata","hybrit",10000);
		
		Vehicle vehicle_1=new Vehicle("toyata","hybrit",10000);
		
		
		Employee emp =new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		boolean value=vehicle_1.equals(vehicle);
		System.out.println("are both equal and " +value);
		
	}

}
