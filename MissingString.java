import java.util.Arrays;

public class MissingString {
public static void main(String[] args) {
	String str= "abcdfgl";
	int charDiff;
	char[] fdahfah= str.toUpperCase().toCharArray();
	Arrays.sort(fdahfah);
	for (int i = 0; i < fdahfah.length-1; i++) {
	charDiff=(fdahfah[i+1]-fdahfah[i]);
	if(charDiff>1){
		for (int j = 1; j < charDiff; j++) {
			char c = (char) (fdahfah[i]+j);
			System.out.println("Missing character "+c);
		}
	}
	}
}
}
