// 윷놀이
#include <iostream>

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    for(int i = 0; i< 3; i++) {
        int back = 0; 
        int backOrBae;
        for(int i = 0; i<4; i++) {
            cin>>backOrBae;
            if(backOrBae == 0) {
                back++;
            }
        }
        
        char resultList[5] = {'E', 'A', 'B', 'C', 'D' };
        cout << resultList[back] <<"\n";
    }

    return 0;
}