#include <iostream>
using namespace std;

int Fibonacci(int );
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int num;
    cin>>num;
    cout<<Fibonacci(num)<<"\n";

    return 0;
}

int Fibonacci(int n)
{
    if(n == 0)
    {
        return 0;
    }
    if(n == 1)
    {
        return 1;
    }
    return Fibonacci(n-2)+Fibonacci(n-1);

}