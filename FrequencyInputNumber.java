
public class FrequencyInputNumber {
public static void main(String[] args) {
	 int arr[] = {1, 2, 2, 3, 3,4,5};
	 int c=count(arr,3,arr.length);
	 System.out.println("Count of input number 3 is "+c);
}
private static int count(int[] arr,int x,int n){
	int i=0;int j=0;
	i=first(arr,0,n-1,x,n);
	if(i==-1){
		return i;
	}
	j=last(arr,i,n-1,x,n);
	return j-i+1;
}
private static int first(int[] arr, int lower,int higher,int x,int n){
	if(higher>=lower){
		int mid= lower+higher/2;
		if(mid==0 || x>arr[mid-1] && arr[mid]==x){
			return mid;
		}else if(x>arr[mid]){
			return first(arr,mid+1,higher,x,n);
		}else{
			return first(arr,lower,mid-1,x,n);
		}
	}
	
	return -1;
}
private static int last(int[] arr, int lower,int higher,int x,int n){
	if(higher>=lower){
		int mid= lower+higher/2;
		if(mid==n-1 || x<arr[mid+1] && arr[mid]==x){
			return mid;
		}else if(x<arr[mid]){
			return last(arr,lower,mid-1,x,n);
		}else{
			return last(arr,mid+1,higher,x,n);
		}
	}
	
	return -1;
}
}
