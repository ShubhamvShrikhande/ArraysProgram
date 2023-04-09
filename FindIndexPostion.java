package ArraysProgram;

public class FindIndexPostion {
	public static void elements(int[] arr) {
		int temp = 4;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == temp) {
				System.out.println("index postion:" + i);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7 };
		elements(arr);
	}

}
