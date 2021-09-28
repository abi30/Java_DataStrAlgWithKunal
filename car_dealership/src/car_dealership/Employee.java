package car_dealership;

public class Employee {
	
	
	public void handleCustomer(Customer cust,boolean finance,Vehicle vehicle) {
		
		if(finance==true) {
		double loanAmount= vehicle.getPrice()-cust.getCashOnHand();	
		runCreditHistory(cust,loanAmount);
		}
		else if(vehicle.getPrice()<=cust.getCashOnHand()) {
		processTransaction(cust,vehicle);
		}
		else 
			System.out.println("tell Customer to need more money");
	
		
		
	}
	public void runCreditHistory(Customer cust,double loanAmount) {
		
		System.out.println("ran credit history the customer ");
		System.out.println("The customer has been approved to purchase vehicle");
	}

	
	public void processTransaction(Customer cust,Vehicle vehicle) {
	System.out.println("Customer has purchase the vehicle..!"+vehicle +" for the price:"+vehicle.getPrice());
		
	}

}
