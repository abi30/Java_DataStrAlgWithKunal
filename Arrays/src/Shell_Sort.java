
public class Shell_Sort {

	public static void main(String[] args) {
	
		
		int []intArray= {20,35,7,-15,1,55,-22};
		
		Shell(intArray);
		
		
		for (int i = 0;i <intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}	

	}
	public static void Shell(int[]array) {
		
		// array= {20,35,7,-15,1,55,-22};

		
		for (int gap = array.length/2;gap>0;  gap/=2) {
			for (int i = gap ;i <array.length;i++) {
				int newItem= array[i];
				
				int j= i;
				while (j>=gap && array[j-gap]>newItem) {
					array[j]= array[j-gap];
					j-=gap;
				}
				array[j]=newItem;
			}
		}
	}

}
