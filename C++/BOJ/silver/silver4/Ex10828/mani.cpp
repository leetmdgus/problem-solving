#include <iostream>
#include <stack>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    stack<int> s;

    int n;
    cin >> n; 

    while(n --) {
        string order;
        cin >> order;

        if(order == "push") {
            int x;
            cin >> x;

            s.push(x);    
        } else if(order == "pop") {
            if(s.empty()) {
                cout << -1 << '\n';
            } else {
                cout << s.top() << '\n';
                s.pop();
            }
        }else if(order == "size") {
            cout << s.size() << '\n';
        }else if(order == "empty") {
            cout << s.empty() << '\n';
        }else if(order == "top") {
            if(s.empty()) {
                cout << -1 << '\n';
            } else {
                cout << s.top() << '\n';
            }
        }
    }

    return 0;
}