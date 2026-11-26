#include <stdio.h>

int main(void) {

    int n;

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        char a[1001];

        scanf("%s", a);

        int count = 0;
        for (int j = 0; a[j] != '\0'; j++) {
            count++;
        }
        if (count >= 6 && count <= 9) {
            printf("yes\n");
        } else {
            printf("no\n");
        }
    }

    return 0;
}