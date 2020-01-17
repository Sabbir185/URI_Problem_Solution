#include <iostream>
 
using namespace std;
 
int main() {
 
     int x, y, temp, sum,j;
		
		while (1) {
			cin>>x;
			cin>>y;

			if(x<=0 || y<=0)
				break;
			
			if (x > y) {
				temp = x;
				x = y;
				y = temp;
			}
			
			sum = 0 ;
			for (j = x; j <= y; j++) {
				cout<<j<<" ";
				sum += j;
			}
			cout<<"Sum="<<sum<<endl;
		}
 
    return 0;
}
