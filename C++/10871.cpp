#include <iostream>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int N, X;
    cin>>N>>X;

    while(N--)
    {
        int x;
        cin>>x;
        if(x<X)
            cout<<x<<" ";
    }

    return 0;
}