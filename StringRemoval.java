
public class StringRemoval {
public static void main(String[] args) {
	String str1="Alive is Awesome";
	String str2="asmzgh";
	 int j=0;
	boolean[] arr= new boolean[128];
	 char[] charArray1= str1.toCharArray();
	 char[] charArray2= str2.toCharArray();
	 for (int i = 0; i < charArray2.length; i++) {
		arr[charArray2[i]]=true;
	}
	 
	 for (int i = 0; i < charArray1.length; i++) {
		if (!arr[charArray1[i]]) {
			charArray1[j++]=charArray1[i];
		}
	}
	 
	 System.out.println(new String(charArray1,0,j).toString());
}

}
