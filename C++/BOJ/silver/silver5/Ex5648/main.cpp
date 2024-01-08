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

    vector<long long> v;

    for (int i = 0; i < n; i++) {
        string str;
        cin >> str;

        reverse(str.begin(), str.end()); 
        v.push_back(stol(str)); 
        // stoi -> sting to int
        // stof -> string to float
        // stol -> string to long
        // stod -> string to double
    }

    sort(v.begin(), v.end());

    vector<long long>::iterator iter;
    for (iter = v.begin(); iter != v.end(); iter++) {
        cout << *iter << "\n";
    }

    return 0;
}