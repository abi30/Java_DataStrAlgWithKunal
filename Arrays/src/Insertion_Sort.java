
public class Insertion_Sort {

	public static void main(String[] args) {

int intArray[]= {20,35,-15,7,55,1,-22};
		
		insertion(intArray);

		
		for (int i = 0;i <intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}	
	}
	public static void insertion(int [] array) {
//	 int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

      for (int i = 1; i < array.length; i++) {
    	  
          int newElement = array[i];

          int j=i-1;;

          while ( j >= 0 && array[j] > newElement) {
        	  array[j+1] = array[j];
        	  j--;
          }

          array[j+1] = newElement;
      }

}

}