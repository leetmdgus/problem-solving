#include <iostream>

using namespace std;

int main(void)
{
    int num1, num2;
    cin>>num1>>num2;    //num1 : 472 , num2 : 385
    

    int hund = num2/100;        // hund : 3
    int ten = (num2-hund*100)/10;   //ten : 8   //(385-300)/10
    int one = num2%10;           // one : 5 

    cout<<num1*one<<endl;
    cout<<num1*ten<<endl;
    cout<<num1*hund<<endl;

    cout<<num1*num2<<endl;


    return 0;
}