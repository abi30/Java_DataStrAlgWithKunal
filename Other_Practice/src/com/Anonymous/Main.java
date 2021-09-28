package com.Anonymous;

public class Main {

	public static void main(String[] args) {

Anonymous anon= new Anonymous() {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int age(int age) {
		if (age >= 18) {
			System.out.println("this guys can go inside the disco ");
		}else {
			System.out.println(" sorry !! this guys is not allowed to go inside.");
		}
		return age;
	}
	
};

anon.age(15);


	}

}
