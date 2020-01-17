#include <stdio.h>
 
int main() {
 
   int grenais_count=0, inter_count=0, gremio_count =0, draw_count = 0,n,m,one ;
		
		while (1) {
			
			scanf("%d %d\n",&n,&m);
			grenais_count++ ;
			printf("Novo grenal (1-sim 2-nao)\n");
			if( n>m ) 
				inter_count++ ;
			else if( n<m ) 
				gremio_count++ ;
			else 
				draw_count++ ;
			
			scanf("%d\n",&one);
			if( one == 1 ) {
				continue;
			}else if ( one == 2 ) {
				printf("%d grenais\n",grenais_count);
				printf("Inter:%d\n",inter_count);
				printf("Gremio:%d\n",gremio_count);
				printf("Empates:%d\n",draw_count);
				
				if( inter_count>gremio_count )
					printf("Inter venceu mais\n");
				else if ( inter_count<gremio_count ) {
					printf("Gremio venceu mais\n");
				}else if( inter_count == gremio_count ) 
					printf("Não houve vencedor\n");
				break;
			}
		}
 
    return 0;
}
