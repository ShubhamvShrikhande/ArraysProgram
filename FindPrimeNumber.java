package ArraysProgram;

public class FindPrimeNumber {
	public static void primeNumber(int[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num = arr[i];
			if (isPrime(num)) {
				System.out.println(num + "::is prime number");

			}
		}
	}

	public static boolean isPrime(int num) {
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		primeNumber(arr);
	}

}
