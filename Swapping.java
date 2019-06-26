
public class Swapping {
public static void main(String[] args) {
	String str1="Mohit";
	String str2="Roshan";
	
	str1=str1+str2;
	str2= str1.substring(0, str1.length()-str2.length());
	str1=str1.substring(str2.length());
	
	System.out.println("Strings after swapping "+ str1 +"  "+ str2);
}
}
