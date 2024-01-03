#include <iostream>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    while(true)
    {
        int A, B;
        cin>>A>>B;

        if(cin.eof() == true)
            break;
            
        cout<<A+B<<"\n";
    }

    return 0;
}