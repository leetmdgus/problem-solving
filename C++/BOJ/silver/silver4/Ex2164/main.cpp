#include <iostream>
#include <queue>

using namespace std;
int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    //1. 제일 위에 있는 카드 버림
    //2. 제일 위에 있는 카드 제일 아래로

    deque<int> dq;

    int n;
    cin >> n;

    for(int i = 1; i<=n; i++) {
        dq.push_back(i);
    }

    while(dq.size() != 1) {
        dq.pop_front();
        dq.push_back(dq.front());
        dq.pop_front();
    }

    cout << dq.front();

    return 0; 
}