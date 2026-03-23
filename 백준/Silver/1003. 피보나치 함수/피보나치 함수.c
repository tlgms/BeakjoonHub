#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
    int T, N;
    scanf("%d", &T);

    int zeroCount[41], oneCount[41];

    zeroCount[0] = 1;  oneCount[0] = 0;
    zeroCount[1] = 0;  oneCount[1] = 1;

    for (int i = 2; i <= 40; i++) {
        zeroCount[i] = zeroCount[i - 1] + zeroCount[i - 2];
        oneCount[i] = oneCount[i - 1] + oneCount[i - 2];
    }

    while (T--) {
        scanf("%d", &N);
        printf("%d %d\n", zeroCount[N], oneCount[N]);
    }
    return 0;
}