package ArraysProgram;

public class PrintArrayElement {
	public static void elements(int[] arr) {
		for (int element : arr) {
			System.out.println("Array Element is:" + element);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		elements(arr);

	}

}
