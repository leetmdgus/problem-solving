#include <iostream>

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int length;
    string num;
    
    cin>>length>>num;

    int count = 0;
    for(int i = 0; i<length; i++)
    {
      count += num[i]-48;
    }
    cout<<count<<endl;

    return 0;
}