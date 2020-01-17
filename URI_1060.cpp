#include<bits/stdc++.h>
using namespace std;

int main()
{
    double n;
    int count=0;

    for( int i=0; i<6; i++ )
    {
        scanf("%lf",&n);
        if( n>0 )
        {
            count++ ;
        }
    }
    printf("%d valores positivos\n",count);
}
