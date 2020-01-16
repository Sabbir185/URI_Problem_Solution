#include <iostream>
 
using namespace std;
 
int main() {
 
    int x[10];
	for( int i=0; i<10; i++ )
	{
	    cin>>x[i];
	    if( x[i]<=0 )
	        x[i]=1;
	}
	for( int j=0; j<10; j++ )
	{
	    cout<<"X"<<"["<<j<<"]"<<" = "<<x[j]<<endl;
	}
 
    return 0;
}
