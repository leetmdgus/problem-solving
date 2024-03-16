#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int arr[10001] = {0, };

    int n;
    cin >> n;

    for(int i = 0; i<n; i++) {
        int a;
        cin >> a;
        arr[a]++;
    }

    for(int i = 1; i < 10001; i++) {
        while(arr[i] > 0) {
            cout << i << '\n';
            arr[i]--;
        }
    }
}