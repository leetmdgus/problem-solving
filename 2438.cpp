#include <iostream>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int num;
    cin>>num;

    for(int i = 1; i<=num; i++)
    {
        for(int j = 1; j<=i; j++)
            cout<<'*';
        cout<<"\n";
    }
    return 0;
}