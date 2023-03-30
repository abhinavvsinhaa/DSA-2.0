#include <iostream>
using namespace std;

void selectionSort(int a[], int n) {
	for (int i = 0; i < n; i++) {
		int min = i;

		// find the minimum element in range j:i+1->n-1
		for (int j = i+1; j < n; j++) {
			if (a[min] > a[j]) min = j;
		}

		// swap it with first element in the range
		swap(a[i], a[min]);
	}
}

int main() {
	int n;
	cin >> n;

	int *a = new int[n]; 

	for (int i = 0; i < n; i++) cin >> a[i];

	selectionSort(a, n);

	for (int i = 0; i < n; i++) cout << a[i] << " ";

	delete[] a;
	return 0;
}