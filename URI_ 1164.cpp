#include <iostream>
 
using namespace std;
 
int main() {
 
    int t;
    cin>>t;
        int sum,n;
        for (int i = 1; i <= t ; i++) {
            cin>>n;
            sum=0;
            for (int j = 1; j < n ; j++) {
                if ( n%j==0 )
                {
                    sum = sum+j;
                }
            }
            if (sum==n)
                cout<<n<<" eh perfeito"<<endl;
            else
                cout<<n<<" nao eh perfeito"<<endl;
        }
 
    return 0;
}
