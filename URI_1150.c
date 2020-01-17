#include <stdio.h>
 
int main() {
 
    int x,z,i;
	    scanf("%d\n",&x);
        int count = 0,sum=0;
        while (1)
        {
            scanf("%d\n",&z);
            if (z <= x) {
                continue;
            }
            else
            {
                for (i = x; i <z ; i++) {
                    sum = sum+i;
                    count++;
                    if (sum>z)
                    {
                        break;
                    }
                }
            }
            printf("%d\n",count);
            break;
        }
 
    return 0;
}
