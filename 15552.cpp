#include <iostream>

using namespace std;

int main(void)
{   
    int repeat;
    cin>>repeat;

    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    while(repeat--)
    {
        int A, B;
        cin>>A>>B;

        cout<<A+B<<"\n";
    } 

    return 0;
}