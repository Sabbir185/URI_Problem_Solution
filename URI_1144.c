#include <stdio.h>
 
int main() {
 
    int x,a,b,c,i;
	scanf("%d\n",&x);
	for(i=1;i<=x;i++)
	{
	    a=i;
	    b=i*i;
	    c=i*i*i;
	    printf("%d %d %d\n",a,b,c);
	    b++;
	    c++;
	    printf("%d %d %d\n",a,b,c);
	}
 
    return 0;
}
