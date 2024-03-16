#include <iostream>
#include <algorithm>
using namespace std;
int m, n;
bool isPrime[1000001];

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    cin >> m >> n;
    
    fill(isPrime, isPrime + n +1 , true);
    isPrime[1] = false;
    for(int i = 2; i<=n ;i++) {
        for(int j = i + i; j<=n ;j+=i) {
            isPrime[j] = false;
        }
    }

    for(int i = m;i <= n; i++) {
        if(isPrime[i]) {
            cout << i << '\n';
        }
    }

    return 0; 
}