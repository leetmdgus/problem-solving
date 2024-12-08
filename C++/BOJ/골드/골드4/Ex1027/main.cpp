#include <iostream>

using namespace std;

long long building[50];

double gradient(int a, int b) {
    return (double)(building[b] - building[a]) / (double)(b - a);
}

int main() {
    int N;
    cin >> N;

    for(int i = 0; i<N; i++) {
        cin >> building[i];
    }
    
    int res[50] = {0, }; 
    // -> 로 보기
    for(int i = 0; i<N ;i++) {
        for(int j = i+1; j<N ;j++) {
            bool visible = true;

            for(int k = i+1; k<j; k++) {
                if(gradient(i, k) >= gradient(i, j)) {
                    visible = false;
                    break;
                } 
            }
            if(visible) res[i]++;
        }
    }
    // <- 로 보기
    for(int i = N-1; i>=0;i--) {
        for(int j = i-1; j>=0; j--) {
            bool visible = true;
            for(int k = i-1; k>j; k--) {
                if(gradient(i, j) >= gradient(i, k)) {
                    visible = false;
                    break;
                } 
            }
            if(visible) res[i]++;
        }
    }

    int maxV = 0; 
    for(int i = 0; i<N ;i++) {
        maxV = max(maxV, res[i]);
    }

    cout << maxV << endl;
    return 0; 
}