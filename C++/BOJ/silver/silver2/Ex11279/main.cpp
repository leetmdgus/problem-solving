#include <iostream>

#include <queue>
using namespace std;

int main(void) {
    priority_queue<int> pq;
    vector<int> result;

    int n;
    cin >> n;
    while(n--) {
        int x;
        cin >> x;

        if(x == 0) {
            if(pq.empty()) {
                 result.push_back(0);
            } else {
               result.push_back(pq.top());
                pq.pop();
            }
        } else {
            pq.push(x);
        }
    }
    for (int i = 0; i < result.size(); i++){
        cout << result[i] << '\n';
    }

    return 0; 
}