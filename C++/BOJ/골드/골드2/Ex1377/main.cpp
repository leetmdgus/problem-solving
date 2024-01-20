#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int n;
    cin >> n;

    vector<int> sortedVector(n, 0);    
    vector<int> vector(n, 0);

    for(int i = 0; i<n; i++ ){
        cin >> vector[i];
        sortedVector[i] = vector[i];
    }
    
    sort(sortedVector.begin(), sortedVector.end());

    for(int i = 1; i<=n; i++) {
        if(vector[n-i] == sortedVector[n-i]) {
            cout<< i;
            break;
        }
    }

    return 0; 
}