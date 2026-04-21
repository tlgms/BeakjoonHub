#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* str1, const char* str2) {
    int len = strlen(str1);
    char* answer = (char*)malloc(len * 2 + 1);
    
    int idx = 0;
    for (int i = 0; i < len; i++) {
        answer[idx++] = str1[i];
        answer[idx++] = str2[i];
    }
    answer[idx] = '\0';

    return answer;
}
