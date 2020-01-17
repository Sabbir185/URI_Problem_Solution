#include <bits/stdc++.h>
using namespace std;

int main()
{
    int count=0;
    float sum=0;
    float arr[6];
    for( int i=0; i<6; i++ )
    {
        cin>>arr[i];

        if( arr[i] > 0)
        {
            count = count + 1 ;
            sum = ( sum + arr[i] ) ;
        }

    }
    printf("%d valores positivos\n",count);
    printf("%.1f\n",sum/count);

    return 0;
}
