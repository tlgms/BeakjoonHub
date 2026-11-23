#include <stdio.h>

int main(void) {

    int a;
    scanf("%d", &a);
    int arr[a];

    for (int i = 0; i < a; i++) {
        scanf("%d", &arr[i]);
    }

    int sorted_arr_index[a];
    int index = 0;

    for (int i = 0; i < a; i++) {
        int min_index = 0;
        for (int j = 1; j < a; j++) {
            if (arr[j] < arr[min_index]) {
                min_index = j;
            }
        }

        sorted_arr_index[min_index] = index++;

        arr[min_index] = 1001;
    }
    

    for (int i = 0; i < a; i++) {
        printf("%d ", sorted_arr_index[i]);
    }

    return 0;
}