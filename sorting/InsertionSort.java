import java.util.Scanner;
import java.util.Collections;

public class InsertionSort {
	
	public static void sort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int j = i;
			while (j > 0 && a[j-1] > a[j]) {
				int temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
				
				--j;
			}
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int a[] = new int[size];
		for (int i = 0; i < size; i++) a[i] = scan.nextInt();

		sort(a);

		for (int i = 0; i < size; i++) System.out.print(a[i] + " ");

	}
}