#include <iostream>
 
using namespace std;
 
int main() {
 
    int x;
    cin>>x;
        int multi=1;
        for (int i = 1; i <=x ; i++) {

            multi = multi*i;
        }
        cout<<multi<<endl;
 
    return 0;
}
