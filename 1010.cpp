#include <iostream>

using namespace std;
float fact(int );

int main(void)
{    
    int repeat;
    cin>>repeat;


    while(repeat--)
    {
        int N, M;
        cin>>N>>M;

        float case_num;
        case_num = fact(M) / fact(M-N) / fact(N);
        
        cout<<case_num<<"\n";
    }
    return 0;
}

float fact(int x)
{
    if(x <= 1)
        return 1;
    return x*fact(x-1);
}