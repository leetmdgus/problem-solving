#include <iostream>

#define ARRAY_SIZE 50

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);


    int N;
    cin>>N;
    int measure[ARRAY_SIZE]; 
    int min = 1000000;
    int max = 2;

    for(int i = 0; i<N; i++)
    {
        cin>>measure[i];
        if(measure[i]>max)
        {
            max = measure[i];
        }
        if(measure[i]<min)
        {
            min = measure[i];
        }
    }

    cout<<max*min<<endl;
    
    return 0;
}