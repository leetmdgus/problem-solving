#include<iostream>
using namespace std;

int main(void)
{
    int list[6] = {0,1,2,3,4,5};

    cout<<"&list[0]: "<<&list[0]<<endl; //0x61fef8  //4씩 증가하는 것을 알수있다. 
    cout<<"&list[1]: "<<&list[1]<<endl; //0x61fefc  //sizeof(int) == 4byte
    cout<<"&list[2]: "<<&list[2]<<endl; //0x61ff00
    cout<<"&list[3]: "<<&list[3]<<endl; //0x61ff04
    cout<<"&list[4]: "<<&list[4]<<endl; //0x61ff08
    cout<<"&list[5]: "<<&list[5]<<endl; //0x61ff0c
    return 0;
}