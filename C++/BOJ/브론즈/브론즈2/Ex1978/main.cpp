#include <iostream>
#include <algorithm>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    bool arr[1001];
    fill(arr, arr+1000, true);
    arr[1] = false;
    
    for(int i = 2; i<=1000; i++) {
        for(int j = i+i ;j<=1000; j+=i) {
            arr[j] = false;
        }
    }

    int n; 
    cin >> n;

    int cnt = 0; 
    for(int i = 0; i<n; i++) {
        int x;
        cin >> x;
        if(arr[x]) {
            cnt++;
        }
    }
    cout << cnt <<'\n';
    return 0; 
}