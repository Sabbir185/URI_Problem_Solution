#include<bits/stdc++.h>

using namespace std;

int main()
{
    int input,even=0,odd=0,positive=0,neg=0;
    for(int i=0; i<5; i++)
    {
        cin>>input;
        if( input%2==0)
        {
            even++;
        }
        if( input%2==1 || input%2==-1)
        {
            odd++ ;
        }
        if( input>0)
        {
            positive++;
        }
        if( input<0 )
        {
            neg++;
        }
    }

    cout<<even<<" valor(es) par(es)"<<endl;

    cout<<odd<<" valor(es) impar(es)"<<endl;

    cout<<positive<<" valor(es) positivo(s)"<<endl;

    cout<<neg<<" valor(es) negativo(s)"<<endl;


    return 0;
}
