#include <iostream>
#include <queue>
using namespace std;

struct XY {
    int x, y;
    XY(int x, int y) : x(x), y(y) {}

    // 현재 객체가 다른 객체보다 클때, 그것을 작다라고 표현한다
    bool operator<(const XY o) const {
        if(this->y == o.y) {
            return this->x > o.x;
        } else {
            return this->y > o.y;
        }
    }
};

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    priority_queue<XY> pq;

    int n;
    cin >> n;

    for(int i = 0; i<n; i++) {
        int x, y;
        cin >> x >> y;

        pq.push({x, y});
    }

    while(!pq.empty()) {
        cout << pq.top().x << " " << pq.top().y <<'\n';
        pq.pop();
    }

    return 0; 
}