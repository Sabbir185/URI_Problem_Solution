#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
 
    int a[50],n,i;
    cin>>n;

    a[0] = 0;
    a[1] = 1;
    for( i=2; i<n; i++)
    {
        a[i] = a[i-1] + a[i-2];
    }
    
    cout<<a[0];

    for(i=1; i<n; i++)
    {
        cout<<" "<<a[i];
    }
    printf("\n");
 
    return 0;
}
