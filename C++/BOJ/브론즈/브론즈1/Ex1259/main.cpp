#include <iostream>
using namespace std;

int main(void) {
    while(true) {
        string str;

        cin >> str;

        if(str == "0") break;

        bool flag = true;
        for(int i = 0; i<=str.length()/2; i++) {
            if(str[i] != str[str.length() - i -1]) {
                flag = false;
            }
        }
        
        if(flag) {
            cout << "yes\n";
        } else {
            cout << "no\n";
        }
        
    }

    return 0;
}