#include <stdio.h>
 
int main() {
 
    double x[100];
    int i,j;
     double z;
     scanf("%lf",&z);
     for(i=0;i<100;i++)
     {
         x[i]=z;
         z=z/2.0000;
     }
     for(j=0;j<100;j++)
     {
         
         printf("N[%d] = %.4lf\n",j,x[j]);
     }
 
    return 0;
}
