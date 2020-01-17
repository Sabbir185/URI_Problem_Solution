#include <stdio.h>
 
int main() {
 
    int x,y,i,j;
    scanf("%d\n",&x);
    scanf("%d\n",&y);

        for (i=1; i<=y; i++ )
        {
            printf("%d",i);
            for (j = 1; j <= x-1 ; j++) {
                i++;
                printf(" %d",i);
            }
            printf("\n");
        }
 
    return 0;
}
