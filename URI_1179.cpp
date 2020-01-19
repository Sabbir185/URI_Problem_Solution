#include <iostream>
 
using namespace std;
 
int main() {
 
        int odd[5];
        int even[5];    
        int n,E=0,O=0;
        for (int i = 0; i < 15 ; i++)
        {
            cin>>n;
            if ( n%2==0 )
            {
                even[E] = n ;
                E++ ;
                if ( E==5 )
                {
                    int j=0;
                    for (j = 0; j < 5; j++)
                    {
                        cout<<"par["<<j<<"] = "<<even[j]<<endl;
                        even[j] = 0 ;
                    }
                    E = 0 ;
                }
            }
            else
            {
                odd[O] = n ;
                O++ ;
                if ( O==5 )
                {
                    int k=0;
                    for (k = 0; k < 5; k++)
                    {
                        cout<<"impar["<<k<<"] = "<<odd[k]<<endl;
                        odd[k]= 0;
                    }
                    O = 0 ;
                }
            }
        }
        for (int i = 0; i < 5 ; i++) {
            if ( odd[i] == 0 )break;
            cout<<"impar["<<i<<"] = "<<odd[i]<<endl;
        }
        for (int i = 0; i < 5 ; i++) {
            if ( even[i] == 0 )break;
            cout<<"par["<<i<<"] = "<<even[i]<<endl;
        }
 
    return 0;
}
