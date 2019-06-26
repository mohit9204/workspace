import java.util.Arrays;

public class EvenandOddIndex {
public static void main(String[] args) {
	int[] arr= {1,2,4,5,3,9,6,10};
	int evenindex=0;
	int oddIndex=1;
	int n=arr.length;
	while(true){
		while(evenindex<n && arr[evenindex]%2==0){
			evenindex=evenindex+2;
		}
		while(oddIndex<n && arr[oddIndex]%2!=0){
			oddIndex=oddIndex+2;
		}
		if(evenindex<n && oddIndex<n){
			int temp= arr[evenindex];
			arr[evenindex]=arr[oddIndex];
			arr[oddIndex]=temp;
		}else
			break;
	}
	
	System.out.println("Array after process "+Arrays.toString(arr));
}
}
