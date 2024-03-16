#include <iostream>
#include <math
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int n, m, b;

    cin >> n >> m >> b;

    int map[n][m];
    for(int i = 0; i<n; i++) {
        for(int j = 0; j<m; j++) {
            cin >> map[i][j];
        }
    }
    

    return 0; 
}