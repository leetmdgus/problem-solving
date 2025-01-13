#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> t(n + 1), p(n + 1), dp(n + 2, 0);

    // 상담 일정 입력
    for (int i = 1; i <= n; ++i) {
        cin >> t[i] >> p[i];
    }

    int start, end;
    cin >> start >> end;

    // DP 배열 갱신 (역순으로 탐색)
    for (int i = n; i >= 1; --i) {
        if (i + t[i] <= n + 1) { // 상담이 유효한 경우
            dp[i] = max(dp[i + 1], p[i] + dp[i + t[i]]);
        } else {
            dp[i] = dp[i + 1]; // 상담 불가능한 경우
        }
    }

    // start부터 end까지의 최대 이익 계산
    int max_profit = 0;
    for (int i = start; i <= end; ++i) {
        // end를 넘지 않는 상담만 포함
        if (i + t[i] - 1 <= end) {
            max_profit = max(max_profit, dp[i]);
        }
    }

    cout << max_profit << endl;

    return 0;
}
