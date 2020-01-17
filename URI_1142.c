#include <stdio.h>
 
int main() {
 
    int x,i,j;
        scanf("%d\n",&x);
        int count=0;
        for (i=1; i<=x; i++ )
        {
            for (j=1;j<=3;j++ )
            {
                    count+=1;
                    printf("%d ",count);

            }
            printf("PUM\n");
            count+=1 ;
        }
 
    return 0;
}
