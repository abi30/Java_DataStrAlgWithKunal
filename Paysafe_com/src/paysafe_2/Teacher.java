package paysafe_2;

public class Teacher extends Person {
	
	

private String  qualification;

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}


public void displayinfo() {
	System.out.println("my name is "+getName()+"\nand "
		  +getAge()+" years old from "+getCountry()+
		  " \nand my qualificartion is "+getQualification());
}


@Override
void displayInformation() {
	System.out.println("name : "+getName());

	System.out.println("country :"+getCountry());
}

	

}
