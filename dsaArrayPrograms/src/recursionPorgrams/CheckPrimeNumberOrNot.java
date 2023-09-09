package recursionPorgrams;

public class CheckPrimeNumberOrNot {

	public static boolean isPrime(int n, int i) {

		if (i== 1)

			return true;

		else if (n%i == 0)

			return false;

		else

			return isPrime(n, --i);

	}

	public static void main(String[] args) {

		System.out.println(isPrime(5, 5/2 ));// true
		System.out.println(isPrime(9, 6/2));// false

	}

}
