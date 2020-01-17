#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
 
        float score;
		float avg,count=0,store=0;
		
		while (1) {
			
			cin>>score;
			
			if( score>=0 && score<=10 )
			{
				store+=score ;
				count++ ;
			}
			else
				cout<<"nota invalida"<<endl;
			if(count==2)
				break;
			
		}
		
		avg = store/2.00;
		printf("media = %.2f\n",avg);
 
 
    return 0;
}
