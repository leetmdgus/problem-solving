#include <iostream>
#include <queue>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int n;
    cin >> n;

    queue<int> q;
    
    while(n--) {
        string order;
        cin >> order;

        if(order == "push") {
            int x;
            cin >> x;
            q.push(x);

        } else if(order == "pop") {
            if(q.empty()) cout << -1 << '\n';
            else {
                cout << q.front() << '\n';
                q.pop();
            }
        } else if(order == "size") {
            cout << q.size() <<'\n';
        } else if(order == "empty") {
            cout <<q.empty() << '\n';
        } else if(order == "front") {
            if(q.empty()) cout << -1 << '\n';
            else {
                cout << q.front() << '\n';
            }
        } else if(order == "back") {
            if(q.empty()) cout << -1 << '\n';
            else {
                cout << q.back() << '\n';
            }
        }
    }

    return 0; 
}