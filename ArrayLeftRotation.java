import java.util.Arrays;

public class ArrayLeftRotation {
public static void main(String[] args) {
	int[] arr={1,5,4,4,6,8,4};

rotation(arr, 2, arr.length);
System.out.println("String rotation "+ Arrays.toString(arr));


}

private static void rotation(int[] arr, int d, int n){
	
	reverseArray(arr, 0, d-1);
	reverseArray(arr, d,n-1 );
	reverseArray(arr, 0, n-1);
	
}

private static void reverseArray(int[] arr, int a, int b){
	while (a<b) {
		 int temp= arr[a];
		 arr[a]=arr[b];
		 arr[b]=temp;
		 a++;
		 b--;
	}
	
}
}
