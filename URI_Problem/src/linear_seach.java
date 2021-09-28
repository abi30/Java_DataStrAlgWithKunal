import java.util.Scanner;

public class linear_seach {

	public static boolean search(int arr[], int x) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
	  
		
		Scanner sc = new Scanner (System.in);
	
		int num =sc.nextInt();
		sc.close();
		if (num>200&&num<211) {
		int count= 201;
		int arr [] = new int [10];
		for (int i = 0 ; i<10; i++) {
			arr[i]=count;
			count++;
		}
		boolean result=search(arr,num);
		if(result = true)
		System.out.println(num +" number is inside the array and index  ");
		
		}
		System.out.println("sorry this number is out of the array ");
		
	}
}
