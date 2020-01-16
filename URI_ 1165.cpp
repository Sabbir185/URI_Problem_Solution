#include <iostream>
 
using namespace std;
 
int main() {
 
         int t;
         cin>>t;
        int count,n;
        for (int i = 1; i <= t ; i++) {
            cin>>n;
            count=0 ;
            for (int j = 1; j <= n ; j++) {
                if ( n%j==0 )
                {
                    count++;
                }
            }
            if( count==2 )
                cout<<n<<" eh primo"<<endl;
            else
                cout<<n<<" nao eh primo"<<endl;
        }
 
    return 0;
}
