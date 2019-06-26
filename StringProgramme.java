public class StringProgramme { 
	static void print(String s) 
	{ 
		String fst = ""; 
		int i = 0; 
		for (i = 0; i < s.length();) { 

			while (s.charAt(i) != ' ') { 
				fst = fst + s.charAt(i); 
				i++; 
			} 

			break; 
		} 
		String last = ""; 
		int j = 0; 
		for (j = s.length() - 1; j >= i;) { 
			while (s.charAt(j) != ' ') { 
				last = s.charAt(j) + last; 
				j--; 
			} 
			break; 
		} 
		System.out.print(last); 
		for (int m = j; m >= i; m--) { 
			System.out.print(s.charAt(m)); 
		} 
		System.out.println(fst); 
	} 

	public static void main(String[] args) 
	{ 
		String s = "Mohit Raj Roshan"; 
		print(s); 
	} 
} 
