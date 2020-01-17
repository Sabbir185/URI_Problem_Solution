#include <stdio.h>
 
int main() {
 
    int a,i,n;
	    scanf("%d",&a);
        int count=0;
        while (1)
        {
            scanf("%d",&n);
            if (n>0)
            {
                for (i = 0; i <n ; i++) {
                    count+=a+i;
                }
                break;
            }else continue;
        }
        printf("%d\n",count);
 
    return 0;
}
