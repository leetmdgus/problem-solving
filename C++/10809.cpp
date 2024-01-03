#include <iostream>

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    const int ALPHA_COUNT = 26;
    char alpha[ALPHA_COUNT] = {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    string s;
    cin>>s;
    
    int loc[ALPHA_COUNT];
    for(int i = 0; i<ALPHA_COUNT; i++)
    {
        loc[i] = -1;
    }  

    int count = 0;
    for(int i = 0; i<s.length(); i++)
    {
      for(int j = 0; j<ALPHA_COUNT; j++)
      {
        if(s[i] == alpha[j])
        {
          if(loc[j] == -1)
          {
            loc[j] = count;
          }
          count++;
          break;
        }
      }
    }

    for(int i = 0; i<ALPHA_COUNT; i++)
    {
      cout<<loc[i]<<" ";
    }
    return 0;
}