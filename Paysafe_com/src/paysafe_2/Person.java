package paysafe_2;

public class Person {
	
	private String name;
	private int age;
	private String country;
	
	
	
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	void displayInformation() {
		System.out.println("name : "+name);
		System.out.println("Age :"+age);
		System.out.println("country :"+country);
	}

}
