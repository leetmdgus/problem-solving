#include <iostream>

using namespace std;

int main(void)
{
    int year;
    cin>>year;
    
    try
    {
        if(year%4 == 0)
        {
            if(year%100 !=0 || year%400 == 0)
                cout<<1<<endl;
            else
                throw year;
        }
        else
            throw year;
    }

    catch(int year) //윤년이 아닌경우
    {
        cout<<0<<endl;
    }
    
    return 0;
}