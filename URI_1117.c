#include <stdio.h>
 
int main() {
 
		float score;
		float avg,count=0,store=0;
		
		while (1) {
			
			scanf("%f\n",&score);
			
			if( score>=0 && score<=10 )
			{
				store+=score ;
				count++ ;
			}
			else
				printf("nota invalida\n");
			if(count==2)
				break;
			
		}
		
		avg = store/2.00;
		printf("media = %.2f\n",avg);
 
    return 0;
}
