#include <iostream>

using namespace std;

int main(void)
{
    int N, M;
    cin>>N >>M;

    int array[100];
    
    for(int i = 0; i<N; i++)
    {
        int num;
        cin>>num;
        array[i] = num;
    }

    
    int sum = 0;

    for(int i = 0; i<N; i++)
    {
        for(int j = i+1; j<N; j++)
        {
            for(int z = j+1; z<N; z++)
            {
                int new_sum = array[i] + array[j] +array[z];
                if(new_sum<=M && new_sum>=sum)
                {
                    sum = new_sum;
                }
            }
        }
    }
    cout<<sum<<endl;

    return 0;
}