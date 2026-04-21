#include <stdio.h>
#include <string.h>

char* solution(char* my_string, const char* overwrite_string, int s) {
    int overwrite_len = strlen(overwrite_string);
    for (int i = 0; i < overwrite_len; i++) {
        my_string[s + i] = overwrite_string[i];
    }

    return my_string;
}

int main() {
    char my_string[1001] = "Hello, world!";
    char overwrite_string[] = "C Language";
    int s = 7;

    printf("Before: %s\n", my_string);
    printf("After: %s\n", solution(my_string, overwrite_string, s));

    return 0;
}
