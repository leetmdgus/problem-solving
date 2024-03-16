#include<iostream>
using namespace std;

int GCD(int a, int r) {
    if(r == 0) return a;
    return GCD(r, a % r);
}

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int a, b;
    cin >> a >> b;

    int max = a > b ? a : b;
    int min = a < b ? a : b;

    // 6 * 12
    // 6 * 4
    // 6 * 3
    
    int gcd = GCD(max, min);
    cout << gcd <<'\n';
    cout << gcd * a/gcd * b/gcd;

    return 0; 
}