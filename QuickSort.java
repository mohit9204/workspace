
public class QuickSort {
	int[] arr;
public static void main(String[] args) {
	int[] arr= {19,3,199,4,6,333};
	QuickSort quick= new QuickSort();
	quick.sort(arr);
}


private void sort(int[] arr){
	this.arr=arr;
	this.quickSort(0, arr.length-1);
}

private void quickSort(int lowerIndex, int higherIndex){
	int i= lowerIndex;
	int j=higherIndex;
	int pivot= arr[lowerIndex+(higherIndex-lowerIndex)/2];
	while(i<=j){
		while(pivot>=i){
			i++;
		}
		while(pivot<=j){
			j--;
		}
		if(i<=j){
			this.exchange(i, j);
			i++;
			j--;
		}
		if(lowerIndex<j){
			this.quickSort(lowerIndex, j);
		}
		if(i<higherIndex){
			this.quickSort(i, higherIndex);
		}
	}
	
}
private void exchange(int i, int j){
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
