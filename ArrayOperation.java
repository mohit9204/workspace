import java.util.Arrays;


public class ArrayOperation {
public static void main(String[] args) {
	int[] arr={1,2,3,4,5,6,7,8};
	int l=0;
	int r=arr.length-1;
	int n=0;
	int k=0;
	while(l<r){
		while(arr[l]%2!=0){
			l++;
			k++;
		}
		while(arr[r]%2==0){
			r--;
		}
		if(l<r){
			int temp= arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
		}
	    Arrays.sort(arr,0,k);
	    Arrays.sort(arr,k,n);
		
	}
}
}
