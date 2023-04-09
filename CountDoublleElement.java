package ArraysProgram;

public class CountDoublleElement {
	public static void element(String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			String number = arr[i];
			for (int j = 0; j < number.length(); j++) {
				if (number.charAt(j) == '1') {
					count++;
				}
			}
		}
		System.out.println("count of 1 is :" + count);
	}

	public static void main(String[] args) {
		String[] arr = { "1", "121", "131", "141", "151", "161", "11" };
		element(arr);
	}

}
