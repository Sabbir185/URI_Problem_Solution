#include <stdio.h>
 
int main() {
 
    long long arr[61];
        arr[0]=0;
        arr[1]=1;
        int n,t,i,j;
        scanf("%d\n",&n);
        for (i = 2; i <=60 ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        for (j = 0; j <n ; j++) {
            scanf("%d\n",&t);
            printf("Fib(%d) = %lld\n",t,arr[t]);
        }
 
    return 0;
}
