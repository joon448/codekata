#include <stdio.h>
int main()
{
	int N, i, j,n=1,t;
	int a[15];
	scanf("%d", &N);
	while (N > 0) {
		a[n] = N % 10;
		N /= 10;
		n++;
	}
	for (i = 1; i <n; i++) {
		for (j = 1; j <n - i; j++) {
			if (a[j]>a[j + 1]) {
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
		}
	}
	for (i = 1; i < n; i++) printf("%d", a[n-i]);
	printf("\n");
}