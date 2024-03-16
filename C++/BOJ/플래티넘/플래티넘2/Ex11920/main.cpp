#include <iostream>
#include <algorithm>
#include <queue>

using namespace std;

struct Num {
    int idx;
    long num;

    Num (int idx, long num) : idx(idx), num(num) {}

    bool operator<(const Num o) const{
        return this-> num > o.num;
    }
};

int main(void){
    int n, k;
    cin >> n >> k;

    priority_queue<int, vector<int>, greater<int>> pq;

    int arr[100001];
    for(int i = 0; i <n ;i++) {
        cin >> arr[i];
    }

    for(int i = 0; i<n ;i++) {
        pq.push(arr[i]);
        if(pq.size() == k+1) {   
            cout << pq.top() << " ";
            pq.pop();
        }
    }
    
    while(!pq.empty()) {
        cout << pq.top() << " ";
        pq.pop();
    }

    return 0; 
}