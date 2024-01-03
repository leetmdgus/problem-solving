#include <iostream>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int repeat = 10;
    int remain[42]={0,};


    while(repeat--)
    {
        int num;
        cin>>num;
        num = num%42;
        
        for(int i = 0; i<42;i++)
        {
            if(num == i)
                remain[i]+=1;
        }
    }

    int remain_num = 0;
    for(int i = 0; i<42; i++)
        {
            if(remain[i]!=0)
                remain_num++;
        }
        
    cout<<remain_num;
    return 0;
}