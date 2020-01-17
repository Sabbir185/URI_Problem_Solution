#include <stdio.h>
 
int main() {
 
		int x, y ;

		while (1) {
			scanf("%d\n",&x);
			scanf("%d\n",&y);

			if (x == y)
				break;

			else if (x > y) {
				printf("Decrescente\n");
			} else
				printf("Crescente\n");
		}
 
    return 0;
}
