package ArraysProgram;

public class LargestNumber {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int num = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num) {
				num = arr[i];
			}
		}
		System.out.println(num);
	}

}
