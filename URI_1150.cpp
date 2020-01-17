#include <iostream>
 
using namespace std;
 
int main() {
 
    int x,z;
	    cin>>x;
        int count = 0,sum=0;
        while (true)
        {
            cin>>z;
            if (z <= x) {
                continue;
            }
            else
            {
                for (int i = x; i <z ; i++) {
                    sum = sum+i;
                    count++;
                    if (sum>z)
                    {
                        break;
                    }
                }
            }
            std::cout << count << std::endl;;
            break;
        }
 
    return 0;
}
