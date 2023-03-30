import java.util.Scanner;
import java.util.Collections;

public class SelectionSort {
	
	public static void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[min] > a[j]) min = j;
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		// selectionSort s = new selectionSort();
		
		int size = scan.nextInt();
		
		int a[] = new int[size];
		for (int i = 0; i < size; i++) a[i] = scan.nextInt();

		sort(a);

		for (int i = 0; i < size; i++) System.out.print(a[i] + " ");

	}
}