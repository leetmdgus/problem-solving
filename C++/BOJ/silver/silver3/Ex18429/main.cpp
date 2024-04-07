#include <iostream>
#include <vector>
using namespace std;

int n, k;
int kit[51];

int backTracking(vector<int>& order, vector<bool> &visited, int current_w) {
    if(current_w < 500) return 0;
    if(order.size() == n ) return 1;
    
    int ret = 0; 
    for(int i = 0;i <n; i++) {
        if(visited[i]) continue;

        order.push_back(kit[i]);
        visited[i] = true;
        ret += backTracking(order, visited, current_w - k + kit[i]);
        visited[i] = false;
        order.pop_back();
    }

    return ret;
}

int main(void) {
    cin >> n >> k;
    for(int i = 0; i<n; i++) {
        cin >> kit[i];
    }

    vector<int> order;
    vector<bool> visited(n, false);
    cout << backTracking(order, visited, 500) << endl;

    return 0; 
}