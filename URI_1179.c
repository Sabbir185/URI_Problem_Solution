#include <stdio.h>
 
int main() {
 
        int odd[5];
        int even[5];    
        int n,E=0,O=0,i,j=0,k=0,h,m;
        for (i = 0; i < 15 ; i++)
        {
            scanf("%d\n",&n);
            if ( n%2==0 )
            {
                even[E] = n ;
                E++ ;
                if ( E==5 )
                {
                    for (j = 0; j < 5; j++)
                    {
                        printf("par[%d] = %d\n",j,even[j]);
                        even[j] = 0 ;
                    }
                    E = 0 ;
                }
            }
            else
            {
                odd[O] = n ;
                O++ ;
                if ( O==5 )
                {
                    for (k = 0; k < 5; k++)
                    {
                        printf("impar[%d] = %d\n",k,odd[k]);
                        odd[k]= 0;
                    }
                    O = 0 ;
                }
            }
        }
        for (m = 0; m < 5 ; m++) {
            if ( odd[m] == 0 )break;
            printf("impar[%d] = %d\n",m,odd[m]);
        }
        for (h = 0; h < 5 ; h++) {
            if ( even[h] == 0 )break;
            printf("par[%d] = %d\n",h,even[h]);
        }
 
    return 0;
}
