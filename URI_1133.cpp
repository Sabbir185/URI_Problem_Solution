#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
 
     int x,y,i,j;
    scanf("%d\n",&x);
    scanf("%d\n",&y);

        if (x>y)
        {
            for( i=y+1; i<x; i++ )
            {
                if ( i%5==2 || i%5==3 )
                {
                    printf("%d\n",i);
                }
            }
        }
        else if (x<y)
        {
            for( j=x+1; j<y; j++ )
            {
                if ( j%5==2 || j%5==3 )
                {
                    printf("%d\n",j);
                }
            }
        }
 
    return 0;
}
