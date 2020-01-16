#include <iostream>
 
using namespace std;
 
int main() {
 
         int m,x,y;
         cin>>m;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            
            cin>>x;
            cin>>y;
            
            if (x % 2 == 1) {
                for (int j = 0; j < y; j++) {
                    sum = sum+x;
                    x+=2;
                }
            }
            else {
                x++;
                for (int j = 0; j < y; j++) {
                    sum = sum+x;
                    x+=2;
                }
            }
            cout<<sum<<endl;
            sum = 0 ;
        }
 
    return 0;
}
