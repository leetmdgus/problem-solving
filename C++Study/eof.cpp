#include <iostream>
using namespace std;

int main(void) {
   int a,b;

   while(true) {
       cin >> a >> b;
       if(cin.eof() == true) {
        // 입력받은 값이 없으면 cin.eof()는 true, 있으면 fasle
           break;
       }
   }
}