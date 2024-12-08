#include <iostream>
#include <math.h>

using namespace std;

int dp[752][752][2];
int arr[752][752];

int R, C;


int solve(int a, int b) {
    int minV = min(dp[a][b][0], dp[a][b][1]);
    if(minV == 0) return 0; 


    for(int i = minV; i>=0; i--) {
        if(a+i > R || b-i <=0 || b+i > C) continue;

        if(dp[a+i][b-i][1] >= i+1 && dp[a+i][b+i][0] >= i+1) {
            return i+1;
        }
    }

    return 1;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cin >> R >> C;

    for(int i = 1; i<=R; i++) {
        for(int j = 1; j<=C; j++) {
            char c;
            cin >> c;

            arr[i][j] = c - '0';
        }    
    }

    for(int i = R; i>0; i--) {
        for(int j = C; j>0; j--) {
            if(arr[i][j]) {
                // 왼쪽 아래에서 올라오는 방향
                dp[i][j][0] = dp[i+1][j-1][0] +1;
                // 오른쪽 아래서 올라가는 방향
                dp[i][j][1] = dp[i+1][j+1][1] +1;
            } 
        }
    }

    int ans = 0; 

    for(int i = 1; i<=R; i++) {
        for(int j = 1; j<=C; j++) {
            ans = max(ans, solve(i, j));
        }
    }

    cout << ans << endl;
    
    return 0; 
}