package ArraysProgram;

public class InsertElement {
	public static void elements(int[] arr) {
		int position = 5;
		int element = 5;
		for (int i = arr.length - 1; i > position - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[position - 1] = element;
		for (int i = 0; i < arr.length; i++)
			System.out.println("element insert in:" + arr[i]);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 8 };
		elements(arr);
	}

}
