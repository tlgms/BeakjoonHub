#include <stdio.h>

int main() {
    int N;
    int F;

    scanf("%d", &N);
    scanf("%d", &F);

    N = N / 100;

    N = N * 100;

    while (N % F) {
        N++;
    }

    int n2 = N / 100;
    n2 = n2 * 100;

    int ans = N - n2;

    printf("%02d", ans);

    return 0;
}