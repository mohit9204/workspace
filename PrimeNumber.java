
public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Check Prime number "+new PrimeNumber().checkPrimeNumber(26));
}
public boolean checkPrimeNumber(int number){
	boolean flag=true;
	int count=0;
	for(int i=2;i<=Math.sqrt(number);i++){
		count++;
		if(number%i==0){
			flag=false;
			break;
		}
	}
	System.out.println("Count "+count);
	return flag;
}
}
