public class ReverseStringPreservingSpace {
	public static void main(String[] args) {
		String str = "Mohit Raj Roshan";
		char[] inputStringArray = str.toCharArray();
		char[] resultArray = new char[inputStringArray.length];
		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] == ' ') {
				resultArray[i] = ' ';
			}
		}
		int j = resultArray.length - 1;
		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] != ' ') {
				if (resultArray[j] == ' ') {
					j--;
				}

				resultArray[j] = inputStringArray[i];

				j--;
			}
		}
		System.out.println("Array after reverse--------- " + String.valueOf(resultArray));

	}
}
