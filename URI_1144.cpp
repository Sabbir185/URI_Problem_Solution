#include <iostream>
 
using namespace std;
 
int main() {
 
    int x,a,b,c;
	cin>>x;
	for(int i=1;i<=x;i++)
	{
	    a=i;
	    b=i*i;
	    c=i*i*i;
	    cout<<a<<" "<<b<<" "<<c<<endl;
	    b++;
	    c++;
	    cout<<a<<" "<<b<<" "<<c<<endl;
	}
 
    return 0;
}
