#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
 
        int N;
        cin>>N;
		int x,y,i;
		double result;
		
		for ( i = 0; i < N; i++) {
			
			cin>>x;
			cin>>y;
			
			if ( y==0 ) {
				cout<<"divisao impossivel"<<endl;
			}else {
				result = ((double)x) / ((double)y);
				printf("%.1lf\n",result);
			}
			
		}
 
    return 0;
}
