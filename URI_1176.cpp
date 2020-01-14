#include <iostream>
 
using namespace std;
 
int main() {
 
        long long arr[61];
        arr[0]=0;
        arr[1]=1;
        int n,t;
        cin>>n;
        for (int i = 2; i <=60 ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        for (int i = 0; i <n ; i++) {
            cin>>t;
            cout<<"Fib("<<t<<") = "<<arr[t]<<endl;
        }
 
    return 0;
}
