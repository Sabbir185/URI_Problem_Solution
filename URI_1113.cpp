#include <iostream>
 
using namespace std;
 
int main() {
 
        int x, y ;

		while (1) {
			cin>>x;
			cin>>y;

			if (x == y)
				break;

			else if (x > y) {
				cout<<"Decrescente"<<endl;
			} else
				cout<<"Crescente"<<endl;
		}
 
    return 0;
}
