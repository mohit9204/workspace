
public class StringPalindrom {
public static void main(String[] args) {
	String str= "mohit";
	boolean flag=true;
	char[] charArray= str.toCharArray();
	 
	for (int i = 0; i < charArray.length/2; i++) {
		if(str.charAt(i)!=str.charAt(str.length()-1-i)){}
		flag=false;
		break;
	}
	
	if(flag){
		System.out.println("String is palindrome");
		
	}
	else {
		
		System.out.println("Not a palindrom");
	}
}
}
