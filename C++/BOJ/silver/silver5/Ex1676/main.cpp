#include <iostream>
using namespace std;

int main(void) {
    int n;
    cin >> n;

    int twoCnt = 0;
    int fiveCnt = 0; 

    for(int i = 2; i<=n; i++) {
        int x = i;
        while(x%2 == 0) {
            twoCnt++;
            x/=2;
        }   

        while(x%5 == 0) {
            fiveCnt ++;
            x/=5;
        }
    }
    
    // 500 / 2 = 250
    // 250 / 2 =  125


    if(twoCnt <= fiveCnt) {
        cout << twoCnt << '\n'; 
    } else {
        cout << fiveCnt <<'\n';
    }

    return 0; 
}