package Client;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object myvalue = new Object();
		String value = "rakib";

		myvalue = value;
//
//		Employee emp1 = new Employee();
//		Accountant acc1 = new Accountant();
//		emp1 = acc1;

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("rakib", 1232, "engineer"));

		ArrayList<Accountant> accountants = new ArrayList<Accountant>();
		accountants.add(new Accountant("sobuj", 453, "event"));
//

//		upper bound
		ArrayList<? extends Employee> emp3 = new ArrayList<>();
		ArrayList<Accountant> acc3 = new ArrayList<>();
		emp3 = acc3;
//		 lower Bound
		ArrayList<? super Employee> emp4 = new ArrayList<>();
		ArrayList<Object> acc4 = new ArrayList<>();
		emp3 = acc3;
		makeEmployeeWork(employees);
		makeEmployeeWork(accountants);
//		 makeAccountantWork(accountants);

	}


	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for (Employee  emp : employees) {
			emp.work();
			System.out.println(emp.toString());
			emp.getDep();
			
		}
	}

//		public static void makeAccountantWork(List<Accountant> accountants ) {
//			for (Employee acc :accountants) {
//				acc.work();
//				System.out.println(acc.toString());
//				acc.getDep();
//			}

}
