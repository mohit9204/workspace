import java.util.HashMap;

public class UniqueString {
public static void main(String[] args) {
	String str= "Mohitt";
	System.out.println("String uniqueness "+ checkUnique(str));
}
private static boolean checkUnique(String str){
	HashMap<Character, Integer> charmap= new HashMap<Character, Integer>();
	boolean flag=true;
	for (int i = 0; i < str.toCharArray().length; i++) {
      if(charmap.containsKey(str.charAt(i))){
    	 flag=false;
    	 break;
      }else{
    	  charmap.put(str.charAt(i),1);
      }
    	  
	}
	return flag;
}
}
