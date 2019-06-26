
public class SumTillSingleDigit {
	int sum=0;
public static void main(String[] args) {
	int input=123456;
	System.out.println("Sum of Numbers "+ new SumTillSingleDigit(). sumNumbers(input));
}
private  int sumNumbers(int n){

if(n<=10){
	return sum;
}else{
	sum=sum+n%10;
   sumNumbers(n/10);
}
return sum;
}
}

