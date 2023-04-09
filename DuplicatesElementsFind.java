package ArraysProgram;

public class DuplicatesElementsFind {
	public static void findElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicates Elements is :" + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 2, 3 };
		findElements(arr);
	}

}
