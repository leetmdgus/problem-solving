#include <iostream>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin>>n;
    
    int cycle = 0;
    int new_n = n;

    while(true)
    {   
        new_n = new_n%10*10 + (new_n/10 + new_n%10)%10;
        cycle++;

        if(new_n == n)
            break;
    }

    cout<<cycle;

    return 0;
}