
public class Bubble_Sort {

	public static void main(String[] args) {

		int intArray[]= {20,35,-15,7,55,1,-22};
		
		// Bubble_Sort is a stable Sort.
		for (int unSortedL_Index=intArray.length-1; unSortedL_Index>1;unSortedL_Index--) {
			
			for (int i =0;i<unSortedL_Index;i++) {
				if (intArray[i]<intArray[i+1]) {
					swap(intArray,i,(i+1));
				}
			}
		}
		for (int i = 0;i <intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
	
		
	}
	
	public static void swap(int [] array,int i,int j) {
		if (i==j) {
			return;
		}
		int tmp=array[i];
		    array[i]=array[j];
		    array[j]=tmp;
	}

}
