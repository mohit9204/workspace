
public class Pangram {
	static int NO_OF_LETTERS_OF_ALPHABET=26;
public static void main(String[] args) {
	String str= "The quick brown fox jumps over the lazy dog";
	System.out.println("Check panagram "+checkpangram(str));

	
}
public static boolean checkpangram(String sentence){
	
	if (sentence.length() < NO_OF_LETTERS_OF_ALPHABET) {
		return false;
	}

	for (char ch = 'A'; ch <= 'Z'; ch++) {
		if (sentence.indexOf(ch) < 0
				&& sentence.indexOf((char) (ch + 32)) < 0) {
			return false;
		}
	}

	return true;
}
}
