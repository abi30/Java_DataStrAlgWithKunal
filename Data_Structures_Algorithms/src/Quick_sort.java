
public class Quick_sort {

	int partition(int Arr[], int low, int high) {

		int pivot = Arr[high];
		int i = (low - 1);
		for (int j = low; j < Arr.length; j++) {
			if (Arr[j] < pivot) {
				i++;

				int temp = Arr[i];
				Arr[i] = Arr[j];
				Arr[j] = temp;

			}
		}
			int temp = Arr[i+1];
			Arr[i+1]=Arr[high];
			Arr[high]=temp;

		
		return i+1;
	}

	void sort(int Arr[], int low, int high) {
		if (low < high) {

			int pi = partition(Arr, low, high);
			sort(Arr, low, pi - 1);
			sort(Arr, pi + 1, high);

		}
	}

	static void printArray(int Arr[]) {
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		int arr[] = { 5, 3, 7, 2, 9, 4 };
int n= arr.length-1;
		System.out.println("unsorted Array ");
		printArray(arr);

		Quick_sort ob = new Quick_sort();
		ob.sort(arr, 0, n);
		
		System.out.println("sorted Array ");
		printArray(arr);

	}

}
