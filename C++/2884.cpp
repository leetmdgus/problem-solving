#include <iostream>

using namespace std;

int main(void)
{
    int H, M;
    cin>>H>>M;

    if(M>=45)
    {
        M-=45;
    }
    else if(M<45)
    {
        if(H == 0)
            H = 24;
        M = 60+ M-45;
        H--;
    }
    cout<<H<<" "<<M<<endl; 

    return 0;
}