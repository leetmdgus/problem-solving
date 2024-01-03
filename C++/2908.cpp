#include <iostream>

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int A; 
    int B;
    cin>>A>>B;
    int a[3] = {A/100, A%100/10, A%10};
    int b[3] = {B/100, B%100/10, B%10};
  
    int tmp;
    tmp = a[2];
    a[2] = a[0];
    a[0] = tmp;

    tmp = b[2];
    b[2] = b[0];
    b[0] = tmp;

    A = a[0]*100+a[1]*10+a[2];
    B = b[0]*100+b[1]*10+b[2];

    if(A>B)
    {
      cout<<A<<"\n";
    }
    else
    {
      cout<<B<<"\n";
    }
    return 0;
}

