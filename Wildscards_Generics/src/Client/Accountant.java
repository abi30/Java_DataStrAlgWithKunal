package Client;

public class Accountant extends Employee{
	
	public Accountant(String name, int id, String dep) {
		super(name, id, dep);
		
		
	}

	@Override
	public void work() {
		System.out.println("Accountant working");
	}
	@Override
	public String toString() {
		return "Accountant [name=" + name + ", id=" + id + ", dep=" + dep + "]";
	}


}
