#include<bits/stdc++.h>

using namespace std ;

int main()
{
    int input;
    cin>>input;
    if( input>=1 && input<=1000)
    {
        for( int i=1; i<=input; i=i+2 )
        {
            cout<<i<<endl;
        }
    }


    return 0;
}
