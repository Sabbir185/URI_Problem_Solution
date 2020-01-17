#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
 
        int x,y;
        cin>>x;
        cin>>y;

        for (int i=1; i<=y; i++ )
        {
            cout<<i;
            for (int j = 1; j <= x-1 ; j++) {
                i++;
                printf(" %d",i);
            }
            printf("\n");
        }
 
    return 0;
}
