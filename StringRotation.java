
public class StringRotation {
public static void main(String[] args) {
	String str= "Mohit";
	String str1="Roshan";
	
	String str2= str+str;
	
	if(str2.contains(str1)){
		System.out.println("Rotated version");
		
	}else
		System.out.println("Not a rotated version");
}
}
