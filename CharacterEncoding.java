
public class CharacterEncoding {
public static void main(String[] args) {
	String str= "MMMoooohhhittt";
	System.out.println("String in encoded format "+ getEncoding(str));
}
private static String getEncoding(String str){
	char prev=str.charAt(0);
	char curr;
	int count=1;
	StringBuilder stringBuild= new StringBuilder();
	for (int i = 1; i <str.toCharArray().length; i++) {
		curr=str.charAt(i);
		if(prev==curr){
			count++;
		}else{
			stringBuild.append(prev);
			stringBuild.append(count);
			prev=curr;
			count=1;
		}
	}
	stringBuild.append(prev);
	stringBuild.append(count);
	if(str.length()<stringBuild.length()){
		return str;
	}else
		return new String(stringBuild);
	
	
}
}
