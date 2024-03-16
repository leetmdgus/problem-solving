#include <iostream>
#include <queue>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);
    
    int n;
    cin >> n;
    priority_queue<int, vector<int>, greater<int>> pq;

    for(int i = 0; i<n; i++) {
        int x;
        cin >> x;
        pq.push(x);
    }

    while(!pq.empty()) {
        cout << pq.top() << '\n';
        pq.pop();
    }

}