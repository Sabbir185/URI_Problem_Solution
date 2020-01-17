#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
 
    int sum = 0,total=0,i,j,x,y;
        scanf("%d\n",&x);
        scanf("%d\n",&y);
        
        if( x<y )
        {
            for ( i = x; i<= y; i++ )
            {
               if ( i%13 != 0)
               {
                   sum+=i;
               }
            }
            printf("%d\n",sum);
        }
        else {

            for ( j = y; j<= x; j++ )
            {
                if ( j%13 != 0)
                {
                    total+=j;
                }
            }
            printf("%d\n",total);
        }
 
    return 0;
}
