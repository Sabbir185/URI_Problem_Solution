#include <stdio.h>
 
int main() {
    
		int x,y;
		while (1) {
			scanf("%d\n",&x);
			scanf("%d\n",&y);
			if (x>0 && y>0)
				printf("primeiro\n");
			else if( x>0 && y<0)
				printf("quarto\n");
			else if( x<0 && y<0 )
				printf("terceiro\n");
			else if(x<0 && y>0)
				printf("segundo\n");
			else 
				break;
		}
 
    return 0;
}
