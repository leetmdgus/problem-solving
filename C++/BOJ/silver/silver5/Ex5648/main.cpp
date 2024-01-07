#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;

    vector<string> v;

    for(int i = 0; i<n; i++) {
        string str;
        cin >> str;
        
        reverse(str.begin(), str.end());
        v.push_back(str);
    }

    // sort(arr, arr+n);

    // for(int i = 0;i <n; i++) {
    //     cout << stoi(arr[i]) << "\n";
    // }

    return 0; 
}