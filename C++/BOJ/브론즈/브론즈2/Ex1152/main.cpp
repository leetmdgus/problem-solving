#include<iostream>
#include<string>

using namespace std;


int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    string str;
    getline(cin, str);
    
    int cnt = 0; 
    
    bool flag = true;
    for(int i = 0; i<str.length(); i++) {
        if(str[i] != ' ' && flag) {
            flag = false;
            cnt++;
        } else if(str[i] == ' '){
            flag = true;
        }
    }

    cout << cnt;
    return 0; 
}