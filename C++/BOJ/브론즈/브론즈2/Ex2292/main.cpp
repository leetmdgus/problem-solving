#include <iostream>
using namespace std;

int main(void) {
    // 1 -> 2 ... 7 (1)  1  6      6*1
    // 1 -> 8 ... 19 (2)  7  18    6*3
    // 1 -> 20 ... 37     19  36    6*6
    // 1 -> 38 ... 61      37  60   6*10
    // 1 -> 62 ... 

    long long n;
    cin >> n;
    n--;

    long long start = 0; 
    long long end = 0;
    int multi = 0; 

    multi = 0; 
    for(long i = 1; ; i++) {
        if(start <= n && end >= n) {
            cout << i << endl;
            break;
        }

        multi += i;
        start = end +1;
        end = 6 * multi;
    }

    return 0; 
}