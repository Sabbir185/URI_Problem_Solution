#include <stdio.h>
 
int main() {
 
   while (1)
        {
            int x,i;
            scanf("%d\n",&x);
            if (x<0 || x>0 )
            {
                printf("1");
                for ( i=2; i<=x; i++ )
                {
                    printf(" %d",i);
                }
                printf("\n");
            }
            else if (x==0)
                break;
        }
 
    return 0;
}
