#include <iostream>

using namespace std;
inline int SQUARE(int num)
{
  return num*num;
}

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int uniqueNumber[5];
    for(int i = 0; i<5; i++)
    {
      cin>>uniqueNumber[i];
    }

    int verificationNumber = 0;
    for(int i = 0; i<5; i++)
    {
      verificationNumber += SQUARE(uniqueNumber[i]);  
    }
    verificationNumber %= 10;
    cout<<verificationNumber<<"\n";
    return 0;
}
