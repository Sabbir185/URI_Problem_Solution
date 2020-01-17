#include <iostream>
 
using namespace std;
 
int main() {
 
   	while (1)
        {
            int x;
            cin>>x;
            if (x<0 || x>0 )
            {
                cout<<"1";
                for ( int i=2; i<=x; i++ )
                {
                    cout<<" "<<i;
                }
                cout<<""<<endl;
            }
            else if (x==0)
                break;
        }
 
    return 0;
}
