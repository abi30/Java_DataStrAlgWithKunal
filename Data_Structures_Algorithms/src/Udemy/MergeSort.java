package Udemy;

public class MergeSort{
	
	int[]array;
	int[]temp;
	int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arrayToSort= {43,25,11,10,82,-21,76,-8};
		MergeSort arr= new MergeSort();
		arr.sort(arrayToSort);
		for(int i=0; i<arrayToSort.length;i++) {
			System.out.println(arrayToSort[i]);
			}
		    System.out.println("Array Lenght="+arrayToSort.length);
		for(int i:arrayToSort){
			System.out.print(i+" ");
		
			}
		
		    System.out.print("");
	       }
	
	public void sort(int[]arrayToSort) {
		this.array=arrayToSort;
		this.length=arrayToSort.length;
		this.temp=new int[length];
		Merge_sort(0,length-1);
	}
	
	public  void Merge_sort(int low,int high) {
		if(low<high) {
			int mid=low+(high-low)/2;
			Merge_sort(low,mid);
			Merge_sort(mid+1,high);
			Merge(low,mid,high);
		}
		
	}
	public void Merge(int low, int mid, int high) {
		
		for(int i=low;i<=high;i++) {
			temp[i]=array[i];
		}
		int i=low;//0
		int j=mid+1;//
		int k=low;//0

		while(i<=mid && j<=high) {
			if(temp[i]<=temp[j]) {
				array[k]=temp[i];
				i++;
				
			}else {
				array[k]=temp[j];
				j++;
				
			}
			k++;
			
		}
		
	/*	if(i<mid) {
			
			while(j<=mid) {
			array[k]=temp[j];
			j++;
			k++;
		  }
		}else {
			*/
			while(i<=mid) {
			array[k]=temp[i];
			i++;
			k++;
		}
			
	/*}*/
		
		
	}

}
