
public class Bubble_sort {

	private static int[] search(int list[], int n) {

		int i, j, temp = 0;

		n = list.length;
//		int count=0;

		for (i = 0; i < n; i++) {
			int flag = 0;
			for (j = 0; j < n - i - 1; j++) {
//				count++;
				if (list[j] > list[j + 1]) {

					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					flag=1;
				}

			}
			if (flag ==0) {
				break;
			}

		}
		return list;
	}

	public static void main(String[] args) {

		int[] array = { 50, 37, 32, 35, 17 };
		search(array, 5);
		for (int i: array) {
			System.out.print( i + " ");
		}

	}

}
