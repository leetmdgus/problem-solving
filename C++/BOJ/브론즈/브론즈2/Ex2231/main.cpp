#include <iostream>
#include <string>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int n;
    cin >> n;
    
    int result = 0; 
    for(int i = 0;i <n; i++) {
        int sum = 0; 
        int num = i;

        while(num != 0) {
            sum += num%10;
            num/=10;
        }

        if(sum + i == n) {
            result = i;
            break;
        }
    }
    
    cout << result;
    return 0; 
}