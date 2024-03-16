#include <iostream>
using namespace std;

int main(void) {
    int t;
    cin >> t;

    while(t-- > 0) {
        string str;
        cin >> str;

        int cnt = 0; 
        bool flag = true;

        for(int i = 0; i<str.length(); i++) {
            if(cnt < 0 ) {
                flag = false;
                break;
            }
            if(str[i] == '(') {
                cnt++;
            } else {
                cnt--;
            }
        }
        if(flag && cnt == 0) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }

    return 0; 
}