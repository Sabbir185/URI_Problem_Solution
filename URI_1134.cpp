#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
 
    int Alcohol_count=0 ,Gasoline_count=0 ,Diesel_count=0,x;
        while (1){
            cin>>x;
            if (x==1)
            {
                Alcohol_count++;
            }
            else if (x==2)
            {
                Gasoline_count++ ;
            }
            else if (x==3)
            {
                Diesel_count++ ;
            }
            else if (x==4)
            {
                cout<<"MUITO OBRIGADO"<<endl;
                cout<<"Alcool: "<<Alcohol_count<<endl;
                cout<<"Gasolina: "<<Gasoline_count<<endl;
                cout<<"Diesel: "<<Diesel_count<<endl;
                break;
            }
            else
                 continue;
        }
 
    return 0;
}
