#include <iostream>

using namespace std;

int main(void)
{
    int *a = new int(5);    //int 만큼의 공간을 힙 영역에 할당하여 5라는 값을 집어 넣고, 주솟값을 a에 넣는다. 
    int *b = new int(3);     

    *a = *b;

    delete a;
    delete b;    

    return 0;
}