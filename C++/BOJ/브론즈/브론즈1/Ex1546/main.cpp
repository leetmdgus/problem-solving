#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    double score[1001];
    int n;
    cin >> n;
    double M = 0; 

    for(int i = 0; i<n; i++){
        cin >> score[i];
        M = score[i] > M ? score[i] : M;
    }   

    for(int i = 0;i <n; i++) {
        score[i] = score[i] / M * 100;
    }

    double sum = 0; 
    for(int i = 0; i<n; i++) {
        sum += score[i];
    }

    cout << sum / n;
    return 0; 
}