#include <iostream>
 
using namespace std;
 
int main() {
 
    int sum = 0,x ;
        while (true)
        {
            cin>>x;
            if ( x==0 )break;
            else if (x%2==0)
            {
                for (int i = 0; i <5 ; i++) {
                    sum = sum + x ;
                    x+=2;
                }
            }
            else {
                x++;
                for (int k = 0; k <5 ; k++) {
                    sum = sum + x;
                    x+=2;
                }
            }
            cout<<sum<<endl;
            sum = 0;
        }
 
    return 0;
}
