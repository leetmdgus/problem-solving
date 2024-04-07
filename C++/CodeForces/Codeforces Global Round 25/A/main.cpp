#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int t;
    cin >> t;

    while(t--) {
        int n;
        cin >> n;
        string str;
        cin >> str;

        int cnt = 0;
        bool isAdjacent = false;

        for(int i = 0; i<n ;i++) {
            if(str[i] == '1') cnt++;
            if(i !=0 && str[i-1] == '1' && str[i] == '1') isAdjacent = true;
        }

        if(cnt == 2 && isAdjacent) {
            cout << "NO\n";
        } else if(cnt %2 == 0){
            cout << "YES\n";
        } else {
            cout << "NO\n" ;
        }

    }
    return 0; 
}