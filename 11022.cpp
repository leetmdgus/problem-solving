#include <iostream>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int repeat;
    cin>>repeat;

    for(int i = 1; i<=repeat; i++)
    {
        int A,B;
        cin>>A>>B;

        int sum = A+B;
        cout<<"Case #"<<i<<": "<<A<<" + "<<B<<" = "<<sum<<"\n";
    }
    return 0;
}