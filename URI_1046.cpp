#include<iostream>
using namespace std;

int main()
{
    int start_time, end_time, durationtm;
    cin>>start_time>>end_time;

    durationtm = end_time - start_time ;

    if ( durationtm < 0 )
    {

        durationtm = 24 + ( end_time - start_time ) ;
    }

    if ( start_time == end_time )
    {
        cout<<"O JOGO DUROU 24 HORA(S)"<<endl;
    }
    else
    {
        cout<<"O JOGO DUROU "<<durationtm<<" HORA(S)"<<endl;
    }
    return 0;
}
