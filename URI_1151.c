#include <stdio.h>
 
int main() {
 
    int a[50],n,i;
    scanf("%d",&n);

    a[0] = 0;
    a[1] = 1;
    for( i=2; i<n; i++)
    {
        a[i] = a[i-1] + a[i-2];
    }
    
    printf("%d",a[0]);

    for(i=1; i<n; i++)
    {
        printf(" %d",a[i]);
    }
    printf("\n");
 
    return 0;
}
