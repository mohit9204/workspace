
public class JumbledNumber {
public static void main(String[] args) {
	int value= 123456;
	boolean flag=true;
	while(value%10>0){
		int first= value%10;
		int second=value/10 %10;
		if(Math.abs(first-second)>1){
			flag=false;
		}
		value=value/10;
	}
	System.out.println("Number is Jumbled :"+flag);
}
}
