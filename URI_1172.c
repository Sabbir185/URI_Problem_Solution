#include <stdio.h>
 
int main() {
 
    int x[10],i,j;
	for( i=0; i<10; i++ )
	{
	    scanf("%d\n",&x[i]);
	    if( x[i]<=0 )
	        x[i]=1;
	}
	for( j=0; j<10; j++ )
	{
	    printf("X[%d] = %d\n",j,x[j]);
	}
 
    return 0;
}
