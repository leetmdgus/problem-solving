#include <iostream>
#include <stack>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int n;
    cin >> n;

    int arr[n];

    stack<int> stack;

    int cnt = 1; 
    string ans = "";

    for(int i= 0; i<n; i++){
        int x;
        cin >> x;

        while(x >= cnt) {
            stack.push(cnt++);
            ans += "+\n";
        }
 
        if(stack.top() == x) {
            stack.pop();
            ans += "-\n";
       } else {
            cout <<"NO";
            return 0;
       }
    }

    cout <<ans;
    
    return 0; 
}

// 4 3 6 8 7 5 2 1
// 1 2 3 4
// 1 2 3
// 1 2
// 1 2 5 6
// 1 2 5
// 1 2 5 7 8
// 1 2 5 7
// 1 2 5
// 1 2 
// 1