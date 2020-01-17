#include <bits/stdc++.h>
using namespace std;

int main() {
	int x,count=0;
        float avg,sum=0;
        while (true)
        {
            cin>>x;
            if ( x>0 )
            {
                sum = sum + x ;
                count++ ;
                continue;
            }
            else break;
        }
        avg = sum/count;
        printf("%.2f\n",avg);
	return 0;
}
