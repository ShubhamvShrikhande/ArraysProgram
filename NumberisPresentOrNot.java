package ArraysProgram;

public class NumberisPresentOrNot {
	public static boolean elements(int[] arr, int number) {
		for (int i = 0; i < arr.length; i++) {
			if (number == arr[i]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 33, 44, 66, 13, 17 };
		int number = 3;
		if (elements(arr, number)) {
			System.out.println("Element is present");
		} else {
			System.out.println("Elements is not present");
		}
	}
}
