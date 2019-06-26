
public class RemoveAdjacentDublicates {
	static long removeRecur(long n) {
		long prev_digit = n % 10;
		long pow = 10;
		long res = prev_digit;
		while (n > 0) {
			long curr_digit = n % 10;
			if (curr_digit != prev_digit) {
				res += curr_digit * pow;
				prev_digit = curr_digit;
				pow *= 10;
			}
			n = n / 10;
		}

		return res;
	}

	public static void main(String[] args) {
		long n = 111124;

		System.out.println(removeRecur(n));
	}
}
