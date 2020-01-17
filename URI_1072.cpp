#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,x,count=0,flag=0;
    cin>>n;
    for( int i=1; i<=n; i++ )
    {
        cin>>x;
        if( x>=10 && x<=20 )
        {
            count++ ;
        }
        else
        {
            flag++ ;
        }
    }
    cout<<count<<" in"<<endl;
    cout<<flag<<" out"<<endl;
}
