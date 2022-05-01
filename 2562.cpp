#include <iostream>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int array[9] = {0,};

    for(int i = 0; i<9; i++)
    {
        cin>>array[i];
    }

    int Max = array[0]; 
    int location = 1;

    for(int i = 0; i<9; i++)
    {
        if(array[i]>Max)
        {
            Max = array[i];
            location = i+1;
        }
    }

    cout<<Max<<"\n"<<location<<"\n";
    return 0;
}