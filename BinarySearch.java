
public class BinarySearch {
public static void main(String[] args) {
	int[] arr= {2,455,234,567,876,900,976,999};
	int key=455;
	BinarySearch binarySerach= new BinarySearch();
	System.out.println(binarySerach.search(arr, key));
	System.out.println(binarySerach.searchRecursion(arr, 0,arr.length, key));
}


private int searchRecursion(int[] arr, int start, int end,int key){
	int mid= start+(end-start)/2;
	if(start<end){
		if(key<arr[mid]){
		return searchRecursion(arr, start, mid, key);
		}
	else if(key>arr[mid]){
		return searchRecursion(arr, mid+1, end, key);
	}else
		return mid;
	
	}
	return -(start + 1);
}
private int search(int[] arr, int key){
	int lower=0;
	int higher=arr.length-1;
	
	while(lower<=higher){
		int mid= lower+higher/2;
          if (key == arr[mid]) {
              return mid;
          }
          if (key < arr[mid]) {
          	higher = mid - 1;
          } else {
          	lower = mid + 1;
          }
	
}
return -1;
	}
}
