#include <iostream>
 
using namespace std;
 
int main() {
 
    int a,i,n;
	    cin>>a;
        int count=0;
        while (1)
        {
            cin>>n;
            if (n>0)
            {
                for (i = 0; i <n ; i++) {
                    count+=a+i;
                }
                break;
            }else continue;
        }
        cout<<count<<endl;
 
    return 0;
}
