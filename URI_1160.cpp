#include <iostream>

using namespace std;

int main()
{
    int year,T;
    int PA,PB;
    double G1,G2;
    cin>>T;
    for (int i = 0; i < T; i++)
    {
        year = 0;
        // Each test case contain 4 input
        cin>>PA;
        cin>>PB;
        cin>>G1;
        cin>>G2;

        while (PA <= PB)
        {
            PA = PA + ((PA * G1) / 100);
            PB = PB + ((PB * G2) / 100);
            year++;
            if (year > 100)
            {
                cout<<"Mais de 1 seculo."<<endl;
                break;
            }
        }
        if (year <= 100)
            cout<<year<<" anos."<<endl;
    }
    return 0;
}
