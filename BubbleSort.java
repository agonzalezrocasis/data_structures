import java.util.Scanner;

public class BubbleSort {

	private static final int N = 10;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[10];
		String sEnter = "Enter %d numbers:";
		System.out.println(String.format(sEnter, N));
		for (int i = 0; i < N; i++)
			numbers[i] = sc.nextInt();
		
		System.out.print("Numbers: ");

		for (int i = 0; i < N; i++)
			System.out.print(numbers[i] + " ");

		BubbleSort.sort(numbers);

		System.out.print("\n\nNumbers sorted: ");

		for (int i = 0; i < N; i++)
			System.out.print(numbers[i] + " ");


	}

	public static void sort(int array[]) {
		int temp = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j < N-1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
}