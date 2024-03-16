#include <iostream>
#include <vector>
using namespace std;

char board[50][50];
int N, M;

int paint(int x, int y) {
    int wStart = 0; 
    int bStart = 0; 

    for(int i = y; i<y+8; i++) {
        for(int j = x; j<x+8;j ++) {
            if((i-y) % 2 == 0 && (j-x) % 2 ==0 || (i-y) % 2 == 1 && (j-x) % 2 ==1) {
                if(board[i][j] == 'W') {
                    bStart++;
                } else {
                    wStart++;
                }
            } else {
                if(board[i][j] == 'B') {
                    bStart++;
                } else {
                    wStart++;
                }
            }
        }
    }

    return wStart > bStart ? bStart : wStart;
}

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    cin >> N >> M;

    string str;

    for(int i = 0;i < N; i++) {
        cin >> str;
        for(int j = 0;j <M; j++) {
            board[i][j] = str[j];
        }
    }

    int ans = 64; 
    for(int i = 0; i<=N-8; i++) {
        for(int j = 0; j<=M-8;j ++) {
            int p = paint(j, i);

            ans = ans > p ? p : ans;
        }
    }

    cout << ans;

    return 0; 
}
