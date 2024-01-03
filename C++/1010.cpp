#include <iostream>

using namespace std;
long long combi(int, int );

int main(void)
{    
    int repeat;
    cin>>repeat;


    while(repeat--)
    {
        long long N, M;
        cin>>N>>M;
        long long result = 1; // fact(M)/fact(M-N)/fact(N);

        result = combi(M, N);

        cout<<result<<"\n";
    }
    return 0;
}


long long combi(int M, int N){
    int i;
    long long mult_up = 1; long long mult_down = 1;

    if(N>M/2) 
    {
        N = M-N; // mCn == mCm-n
    }
    for(i=0; i < N; i++)
    {
        mult_up *= M - i;		
    }
    for(i=0; i < N; i++)
    {
        mult_down *= N - i;
    }

    return mult_up / mult_down;
}