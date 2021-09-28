package car_dealership;

public class Customer {
	
	private String name;
	private String adress;
	private double cashOnHand;
	

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		adress+="Dealership city";
		this.adress = adress;
	}


	public double getCashOnHand() {
		return cashOnHand;
	}


	public void setCashOnHand(double cashOnHand) {
		cashOnHand+=500;
		this.cashOnHand = cashOnHand;
	}


public void purchaseCar(Vehicle vehicle ,Employee emp,boolean finance) {
	emp.handleCustomer(this, finance,vehicle);
		
	}
	
	

}
