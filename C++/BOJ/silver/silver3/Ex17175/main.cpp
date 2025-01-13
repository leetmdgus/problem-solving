#include <iostream>

using namespace std;

int main() {
    int dp[51];

    dp[0] = 1; // fibo(0) 호출
    dp[1] = 1; // fibo(1) 호출
    dp[2] = 3; // fibo(2) -> fibo(0) + fibo(1) 호출
    dp[3] = 5;

    for(int i = 3; i<=50; i++) {
        dp[i] = (1 + dp[i-1] + dp[i-2]) % 1'000'000'007;
    }

    int n;
    cin >> n;

    cout << dp[n];


    return 0; 
}