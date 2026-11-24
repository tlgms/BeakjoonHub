#include <stdio.h>

int main(void) {

    char a[10005];
    char b[10005];

    scanf("%s", a);
    scanf("%s", b);

    long long ans = 0;

    for (int i = 0; a[i] != '\0'; i++) {
        for (int j = 0; b[j] != '\0'; j++) {
            ans += (a[i] - '0') * (b[j] - '0');
        }
    }
    
    printf("%lld\n", ans);
    
    return 0;
}