#include <iostream>
 
using namespace std;
 
int main() {
 
        int N ;
		cin>>N;
		int x,y,temp,sum,i,j;
		
		for (i = 0; i < N; i++) {
			
			cin>>x;
			cin>>y;
			
			if ( x > y ) {   
				temp = x ;
				x = y ;
				y = temp ;
			}
			sum = 0 ;
			
			for (j = x+1 ; j < y ; j++) {
				
				if ( j%2 != 0 ) {
					
					sum += j ;
				}
			}
			cout<<sum<<endl;
		}
 
    return 0;
}
