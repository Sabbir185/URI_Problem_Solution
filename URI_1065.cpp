#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n[5];
    int count=0;
    for( int i=0; i<5; i++ )
    {
        cin>>n[i];
        if( n[i]%2==0 )
        {
            count++ ;
        }

    }
    printf("%d valores pares\n",count);
    return 0;
}
