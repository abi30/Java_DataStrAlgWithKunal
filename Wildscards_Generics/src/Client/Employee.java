package Client;

public class Employee {
	
	String name;
	int id;
	String dep;
	
	
	
	public Employee(String name, int id, String dep) {
		
		this.name = name;
		this.id = id;
		this.dep = dep;
	}
	



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getDep() {
		return dep;
	}




	public void setDep(String dep) {
		this.dep = dep;
	}

	



	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dep=" + dep + "]";
	}




	public void work() {
		System.out.println("Employee  working");
	}

}
