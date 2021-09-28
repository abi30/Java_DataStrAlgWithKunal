public class Insertion_Sort {
	public static void insertionSort(int a[]) {
		int i, j, item;
//[5,4,6,1,3,2]
		for (i = 1; i < a.length; i++) {
			item = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > item) {
				a[j + 1] = a[j];
				j = j - 1;

			}
			a[j + 1] = item;
		
		}
	}

	public static void main(String a[]) {

		int array[] = { 5, 4, 6, 1, 3, 2 };
		System.out.println("privious unsorted array");
		for (int i : array) {
			System.out.print(i + " ");
		}
		insertionSort(array);
		System.out.println();
		System.out.println("Now sorted array");
		for (int i : array) {
			System.out.print(i + " ");
		}

	}
}