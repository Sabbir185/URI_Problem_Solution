#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    float x,y,z,sum;
    cin>>n;
    for(int i=1; i<=n; i+=1 )
    {
        cin>>x;
        cin>>y;
        cin>>z;
        sum = ((x/10)*2 )+((y/10)*3)+((z/10)*5);
        cout<<fixed<<setprecision(1)<<sum<<endl;
    }

    return 0;
}
