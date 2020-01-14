#include <stdio.h>
 
int main() {
 
   float arr[100];
        int i,j;
        for (i = 0; i < 100 ; i++) {
            scanf("%f\n",&arr[i] );
        }

        for (j = 0; j < 100; j++) {
            if (arr[j]<=10.0)
            {
                printf("A[%d] = %.1f\n",j,arr[j]);
            }
        }
    return 0;
}
