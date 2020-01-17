#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
 
        int x;
        cin>>x;
        int count=0;
        for (int i=1; i<=x; i++ )
        {
            for (int j=1;j<=3;j++ )
            {
                    count+=1;
                    cout<<count<<" ";

            }
            cout<<"PUM"<<endl;
            count+=1 ;
        }
 
    return 0;
}
