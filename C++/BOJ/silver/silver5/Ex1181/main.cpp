#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

bool compare(string str1, string str2) {
    if(str1.length() == str2.length()) {
        return str1 < str2;
    } else {
        return str1.length() < str2.length();
    }
}

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int n;
    cin >> n;

    vector<string> v;

    for(int i = 0;i <n; i++) {
        string a;
        cin >> a;
        v.push_back(a);
    }

    sort(v.begin(), v.end(), compare);

    for(int i = 0; i<n ;i++) {
        if(i != 0 && v[i-1] == v[i]) continue;
        cout << v[i] << "\n";
    }

}