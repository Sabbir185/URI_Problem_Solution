#include <stdio.h>
 
int main() {
 
        int N ;
		scanf("%d",&N);
		int x,y,temp,sum,i,j;
		
		for (i = 0; i < N; i++) {
			
			scanf("%d\n",&x);
			scanf("%d\n",&y);
			
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
			printf("%d\n",sum);
		}
 
    return 0;
}
