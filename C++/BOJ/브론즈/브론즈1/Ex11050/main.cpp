#include<iostream>

using namespace std;
int C(int n, int k) {
    if(n == 0) return 1;
    if(k == 0 || n == k) return 1;
    return C(n-1, k-1) + C(n-1, k);
}

int main(void) {
    int n, k;
    cin >> n >> k;
    cout << C(n, k);
    return 0; 
}