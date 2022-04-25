#include <iostream>
 
using namespace std;
 
int main() 
{
    float num = 123.456;

    cout.precision(3);              // 맨 앞에서부터 3자리를 출력하라. 
    cout<<num<<endl;                //-> 123

    cout.precision(4);
    cout<<num<<endl;                 //-> 123.5 // 반올림
                                    
    cout << fixed;                   // 소수점 자릿수 고정
    cout.precision(1);
    cout<<num<<endl;                 //-> 123.5
 
    cout.precision(5);
    cout<<num<<endl;                //-> 123.45600
 
    return 0;
}

