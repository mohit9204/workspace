public class RecursiveSum {
public static void main(String[] args) {
	int input=475869;
	System.out.println("Sum of Numbers "+ sumNumbers(input));
	
}
private static int sumNumbers(int n){
	int sum=0;
	if(n==0){
		return sum;
	}else{
		sum=sum+n%10;
	   sumNumbers(n/10);
	}
	return sum;
	
}
}
