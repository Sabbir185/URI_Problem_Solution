#include <bits/stdc++.h>
using namespace std;

int main() {
	float sum=0;
        for (float i = 1; i <=100 ; i++) {
            sum = sum + (1/i);
        }
        printf("%.2f\n",sum);
	return 0;
}
