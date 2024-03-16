#include <iostream>
using namespace std;

int main(void){
    int t;
    cin >> t;

    int map[15][15];
    for(int i = 0; i<=14; i++) {
        for(int j = 0; j<=14; j++) {
            map[i][j] = 0;

            if(i == 0) map[i][j] = j;
            if(j == 1) map[i][j] = 1;
        }
    }

    for(int i = 1; i<=14; i++) {
        for(int j = 1; j<=14; j++) {
            map[i][j] = map[i][j-1] + map[i-1][j];
        }
    }

    while(t--) {
        int k, n;
        cin >> k >> n;

        cout << map[k][n] << '\n';
    }

    return 0; 
}