#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,count=2;
    cin>>n;
    for(int i=0; i<10000; i+=n )
    {
        cout<<i+count<<endl;
    }


    return 0;
}
