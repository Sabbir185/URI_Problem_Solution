#include <stdio.h>
 
int main() {
 
    int x, y, temp, sum,j;
		
		while (1) {
			scanf("%d\n",&x);
			scanf("%d\n",&y);

			if(x<=0 || y<=0)
				break;
			
			if (x > y) {
				temp = x;
				x = y;
				y = temp;
			}
			
			sum = 0 ;
			for (j = x; j <= y; j++) {
				printf("%d ",j);
				sum += j;
			}
			printf("Sum=%d\n",sum);
		}
 
    return 0;
}
