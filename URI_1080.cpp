#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n[100];
    int maxNum=-1,ind;
    for( int i=0; i<100; i++ )
    {
        cin>>n[i];
        if( maxNum<n[i])
        {
            maxNum = n[i];
            ind = i ;
        }
    }
    cout<<maxNum<<endl;
    cout<<ind+1<<endl;

    return 0;
}
