#include <stdio.h>
 
int main() {
 
    int a,b;
    float i,j;
    for (i = 0.0; i < 2.1; i += 0.2)
    {

        for (j = 1.0; j <= 3.0; j++)
        {

            if ((i > 0 && i < 1) || (i >1 && i < 2) )
            {
                printf("I=%.1f J=%.1f\n", i, (j + i));
            }
            else
            {
                a =  i;
                b = j+i;
                printf("I=%d J=%d\n", a, b);
            }
        }
    }
 
    return 0;
}
