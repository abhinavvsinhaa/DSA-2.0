import java.util.Scanner;
import java.util.Collections;

public class BubbleSort {
	
	public static void sort(int a[]) {
		for (int i = a.length-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
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