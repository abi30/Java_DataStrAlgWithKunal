
public class Selection_sort {

	private static int[] search(int list[], int n) {

		int i, j, minIndex, temp = 0;

		n = list.length;

		for (i = 0; i < n; i++) {
//		minValue= list[i];
			minIndex = i;
			for (j = i + 1; j < n; j++) {
				if (list[j] < list[minIndex]) {

					minIndex = j;
				}

			}
			if (minIndex != i) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}

		return list;

	}

	public static void main(String[] args) {

		int array[] = { 10, 8, 5, 9, 2, 7, 4 };

		search(array, array.length);

		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}

	}

}
