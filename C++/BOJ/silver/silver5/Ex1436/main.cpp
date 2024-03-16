#include <iostream>
using namespace std;

int isContainsNum(int num) {
    int cnt = 0; 
    string str = to_string(num);

    for(int i = 0; i<str.length(); i++) {
        if(str[i] == '6' && cnt == 0) {
            cnt++;
        } else if(str[i] == '6' && str[i-1] == '6') {
            cnt++;
        } else {
            cnt = 0; 
        }

        if(cnt == 3) {
            return true;
        }
    } 
    return false;
} 

int main(void){
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int n;
    cin >> n;

    int cnt = 0; 
    for(long i = 0;; i++) {
        if(isContainsNum(i)) {
            cnt++;
        }
        if(cnt == n) {
            cout << i;
            break;
        }
    }

    return 0; 
}