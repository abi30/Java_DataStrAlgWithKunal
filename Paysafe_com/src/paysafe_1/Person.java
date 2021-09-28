package paysafe_1;

public class Person {
	
	private String name;
	private int age;
	
	
	
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
	void eat() {
		System.out.println(name + "eats lot of fruts ");
	}
	void talk () {
	System.out.println(name+" is " + age +" years old and he likes to talk with people.");
	}
	

	

}
