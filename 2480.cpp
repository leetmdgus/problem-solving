#include <iostream>

using namespace std;

int main(void)
{
    int one, two, three;
    cin>>one>>two>>three;

    int money=0;
    int num;
    if(one == two && one == three)
    {  
        num = one;
        money = 10000+num*1000;
    }
    else if(one == two || one == three || two == three)
    {
        if(one == two)
            num = one;
        else if(one == three)
            num = one;
        else if(two == three)
            num = two;

        money = 1000+num*100;
    }
    else if(one != two && one != three && two != three)
    {
        if(one>two && one >three)
            num = one;
        else if(two>one && two>three)
            num = two;
        else if(three > one && three>two)
            num = three;
        
        money = num*100;
    }
    
    cout<<money<<endl;
    return 0;
}
