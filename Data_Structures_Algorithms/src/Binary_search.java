import java.util.Scanner;

public class Binary_search {

	private static int search(int M_arr[], int x) {

		int left, right, mid = 0;

		left = 0;
		right = M_arr.length - 1;
		while (left <= right) {
			mid = (left + right) / 2;
			if (M_arr[mid] == x) {
				return mid;
			}
			if (M_arr[mid] < x)
				left = mid + 1;

			else {
				right = mid - 1;
			}

		}
		return -1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		sc.close();

		if (x >= 1 && x <= 100) {
			int M_arr[] = { 1, 2, 13, 24, 25, 46, 57, 76, 97, 100 };

			System.out.println(x + " is existed in this Array and index no ." + search(M_arr, x));

		} else
			System.out.println("this number is not present in this arry.");

	}

}
