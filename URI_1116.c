#include <stdio.h>
 
int main() {
 
        int N;
        scanf("%d\n",&N);
		int x,y,i;
		double result;
		
		for ( i = 0; i < N; i++) {
			
			scanf("%d\n",&x);
			scanf("%d\n",&y);
			
			if ( y==0 ) {
				printf("divisao impossivel\n");
			}else {
				result = ((double)x) / ((double)y);
				printf("%.1lf\n",result);
			}
			
		}
 
    return 0;
}
