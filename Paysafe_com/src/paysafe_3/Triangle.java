package paysafe_3;

public class Triangle extends Shape {
	
	
	Triangle(double dim1, double dim2){
	   super(dim1, dim2);
	}
		void area() {
		
			double result = (dim1* dim2)*0.5;
			System.out.println("Triangle result is "+result);
		
	}
}
