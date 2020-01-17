#include <stdio.h>
 
int main() {
 
    float sum=0,j=1.0,i;
        for (i = 1; i <=39 ; i+=2) {
            sum = sum + (i/j);
            j*=2;
        }
        printf("%.2f\n",sum);
 
    return 0;
}
