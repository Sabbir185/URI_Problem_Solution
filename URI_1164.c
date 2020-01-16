#include <stdio.h>
 
int main() {
 
    int t;
    scanf("%d\n",&t);
        int sum,n,i,j;
        for ( i = 1; i <= t ; i++) {
            scanf("%d\n",&n);
            sum=0;
            for ( j = 1; j < n ; j++) {
                if ( n%j==0 )
                {
                    sum = sum+j;
                }
            }
            if (sum==n)
                printf("%d eh perfeito\n",n);
            else
                printf("%d nao eh perfeito\n",n);
        }
 
    return 0;
}
