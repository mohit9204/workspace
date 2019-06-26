import java.util.Arrays;

public class Arrayseparation {
public static void main(String[] args) {
	int[] arrInt= {1,0,0,1,0,1,0,1,1,0,0,0};
	int l= 0;
	int r= arrInt.length-1;
	while (l<r) {
		if(arrInt[l]==0){
			l++;
		}else if(arrInt[r]==1){
			r--;
		}else{
			arrInt[l]=0;
			arrInt[r]=1;
			l++;
			r--;
		}
		
	}
	
	System.out.println("Array separation result "+ Arrays.toString(arrInt));
}
}
