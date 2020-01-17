#include <stdio.h>
 
int main() {
 
   int x,i;
    scanf("%d",&x);
        int multi=1;
        for (i = 1; i <=x ; i++) {

            multi = multi*i;
        }
        printf("%d\n",multi);
 
    return 0;
}
