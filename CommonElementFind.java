package ArraysProgram;

public class CommonElementFind {
	public static void FindElements(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println("Common Element:" + arr2[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 11, 22, 33, 44, 55, 4 };
		int[] arr2 = { 55, 30, 77, 88, 11, 33 };
		FindElements(arr1, arr2);

	}

}
