
public class SearchElement {
public static void main(String[] args) {
	int[] arr={16,19,21,25,3,5,8,10} ;
	int search=16;
	System.out.println("Searched element "+ findNumber(arr, search));
}

private static int findNumber(int[] arr, int search){
	int l=0;
	int r=arr.length-1;
	int mid=0;
	while(l<=r){
		mid=l+((r-l)/2);
		if(arr[mid]==search){
			return mid;
		}
		if(arr[mid]<=arr[r]){
			if(arr[mid]<search && search<=arr[r]){
				l=mid+1;
			}else{
				r=mid-1;
			}
		}else{
			if(arr[l]<=search && search<arr[mid]){
				r=mid-1;
			}else{
				l=mid+1;
			}
		}
	}
	
	return -1;
}
}
