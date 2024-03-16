#include <iostream>
#include <stack>
#include <algorithm>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int k;
    cin >> k;

    stack<int> s;

    for(int i = 0; i<k ;i++) {
        int x;
        cin >> x;

        if(x == 0) {
            if(!s.empty()) {
                s.pop();
            }
        } else {
            s.push(x);
        }
    }
    
    int ans = 0; 
    while(!s.empty()) {
        ans += s.top();
        s.pop();
    }
    cout << ans;


    return 0; 
}