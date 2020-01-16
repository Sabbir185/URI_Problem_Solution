#include <iostream>
 
using namespace std;
 
int main() {
 
        int v,j=1;
    	cin>>v;
    	
        int sum[10];
        
        for (int i = 0; i < 10 ; i++) {
            sum[i] = v * j ;
            j+=j ;
        }
        for (int i = 0; i < 10 ; i++) {
            cout<<"N["<<i<<"] = "<<sum[i]<<endl;
        }
 
    return 0;
}
