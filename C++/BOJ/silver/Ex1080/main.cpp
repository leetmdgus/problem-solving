#include <iostream>

using namespace std;

int A[50][50];
int B[50][50];

int main() {
    int N, M;
    cin >> N >> M;

    for(int i = 0; i<N ;i++) {
        string str;
        cin >> str;
        for(int j = 0; j<M;j ++) {
            A[i][j] = str[j] - '0';
        }
    }

    for(int i = 0; i<N ;i++) {
        string str;
        cin >> str;
        for(int j = 0; j<M;j ++) {
            B[i][j] = str[j] - '0';
        }
    }

    int cnt = 0; 
    for(int i = 0; i<N-2; i++) {
        for(int j = 0; j<M-2; j++) {
            if(A[i][j] == B[i][j]) continue;
            
            cnt++;
            for(int k = i; k<=i+2; k++) {
                for(int p = j; p<=j+2; p++) {
                    A[k][p] = 1-A[k][p];
                }
            }
        }
    }

    for(int i = 0; i<N ;i++) {
        for(int j = 0; j<M; j++) {
            if(A[i][j] != B[i][j]){
                cnt = -1;
            }
        }
    }

    cout << cnt << endl;

    return 0; 
}