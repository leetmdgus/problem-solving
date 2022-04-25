#include <iostream>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int num;
    cin>>num;

    for(int i = 1; i<=num; i++)
        cout<<i<<"\n";
    
    return 0;
}