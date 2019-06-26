
public class MergeSort {
	private int[] arr;
	private int[] tempArr;
	private int size;
public static void main(String[] args) {
	MergeSort merGeSort= new MergeSort();
	int[] arr={3,6,8,1,10} ;
	merGeSort.sort(arr);
}
private void sort(int[] arr){
	this.size=arr.length;
	this.arr=new int[size];
	this.tempArr= new int[size];
	this.mergSort(0, arr.length-1);
}
private void mergSort(int lowerIndex, int higherIndex){
	int mid=lowerIndex+(higherIndex-lowerIndex)/2;
	 if(lowerIndex<higherIndex){
		 mergSort(lowerIndex, mid);
		 mergSort(mid+1, higherIndex);
		 merge(lowerIndex, mid, higherIndex);
	 }
}
private void merge(int lowerIndex,int middle,int higherIndex){
	for (int i =lowerIndex; i <=higherIndex; i++) {
		tempArr[i]= arr[i];
	}
	int i=lowerIndex;
	int j= middle+1;
	int k= higherIndex;
	while(i<=middle && j<=higherIndex){
		if(tempArr[i]<=tempArr[j]){
			arr[k]=tempArr[i];
			i++;
		}else{
			arr[k]=tempArr[j];
			j++;
		}
		k++;
	}
	while(i<=middle){
		arr[k]=tempArr[i];
		i++;
		k++;
	}
	
}
}
