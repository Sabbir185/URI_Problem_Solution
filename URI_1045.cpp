#include<iostream>
using namespace std;

int main()
{
    double a[3];
    for (int i = 0; i < 3; i++)
    {
        cin>>a[i];
    }

    double temp;
    for (int i = 0; i < 3; i++)
    {
        for (int j = i+1; j < 3; j++)
        {

            if ( a[j] > a[i] )
            {
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }

    double A = a[0];
    double B = a[1];
    double C = a[2];

    if ( A >= B + C )
    {
        cout<<("NAO FORMA TRIANGULO\n");
    }
    else if ( A*A > B*B + C*C )
    {
       cout<<("TRIANGULO OBTUSANGULO\n");
    }

    if ( A*A == B*B + C*C )
    {
        cout<<("TRIANGULO RETANGULO\n");
    }

    if ( A*A < B*B + C*C )
    {
        cout<<("TRIANGULO ACUTANGULO\n");
    }

    if ( A == B && B == C && A == C )
    {
        cout<<("TRIANGULO EQUILATERO\n");
    }

    if ( ((A == B) && (A!=C))  || (( A==C)&&(A!=B)) || ((B==C)&&(B!=A))  )
    {
        cout<<("TRIANGULO ISOSCELES\n");
    }

    return 0;
}
