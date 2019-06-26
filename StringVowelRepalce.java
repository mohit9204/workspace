import java.util.ArrayList;

public class StringVowelRepalce {
	public static void main(String[] args) {
		String input = "abcdefg";
		ArrayList<String> list= new ArrayList<>();
		vowelRepalce(input);
	}

	public static boolean vowelCheck(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;

	}

	public static String vowelRepalce(String input) {
		char inputChar = '\0';
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (vowelCheck(input.charAt(i))) {

			}
		}
		return input;

	}
}
