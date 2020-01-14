#include <iostream>
 
using namespace std;
 
int main() {
 
        int arr[1000];
        int j = 0,n,i;
        int s = sizeof(arr)/sizeof(arr[0]);
        scanf("%d",&n);
        for(i = 0; i < s ; i++) {
            if (j==n)
            {
                j=0;
            }
            printf("N[%d] = %d\n",i,j);
            j++;
        }
 
    return 0;
}
