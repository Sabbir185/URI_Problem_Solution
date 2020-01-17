#include <bits/stdc++.h>

using namespace std;

int main()
{
    double salary;
    cin>>salary;

    if( salary>=0.00 && salary<=2000.00 )
    {
        cout<<"Isento"<<endl;
    }
    else if( salary>=2000.01 && salary<=3000.00 )
    {
        printf("R$ %.2f\n",(salary-2000.00)*0.08 );
    }
    else if( salary>=3000.01 && salary<=4500.00 )
    {
        printf("R$ %.2f\n",(salary-3000.00)*0.18 + (1000.00*0.08) );
    }
    else
    {
        printf("R$ %.2f\n",(salary-4500.00)*0.28 + (1500.00*0.18) + (1000.00*0.08) );
    }



    return 0;
}
