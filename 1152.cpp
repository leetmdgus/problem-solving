#include <iostream>

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int count=-1;
    string word;
    while(!cin.eof())
    {
      cin>>word;
      count++;
    }
    
    cout<<count<<"\n";
    return 0;
}