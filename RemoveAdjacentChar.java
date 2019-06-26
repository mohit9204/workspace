
public class RemoveAdjacentChar {
public static void main(String[] args) {
	String str= "MMMMMMMOOOOOOOHHHHHHIT";
	char first=str.charAt(0);
	char second;
	StringBuffer stringBuff= new StringBuffer();
	stringBuff.append(first);
	for (int i = 0; i < str.length(); i++) {
		second=str.charAt(i);
		if(first!=second){
			stringBuff.append(second);
			first=second;
		}
	}
	System.out.println("String after removal of adjacent of character "+ stringBuff);
}
}
