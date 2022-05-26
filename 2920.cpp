#include <iostream>

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int play[8];
    string state = "mixed";
    for(int i=0; i<8; i++)
    {
      cin>>play[i];
    }
    
    int asendCheck = 0;
    int descendCheck = 0;
    for(int i = 0; i<8; i++)
    {
      if(play[i] == i+1)
      {
        asendCheck++;
      }
      else if(play[i] == 8-i)
      {
        descendCheck++;
      }
    }
    if(asendCheck == 8)
    {
      state = "ascending";
    }
    else if(descendCheck == 8)
    {
      state = "descending";
    }
    
    cout<<state<<"\n";
       
    return 0;
}