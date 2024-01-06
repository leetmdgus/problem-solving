#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    vector<int> v;

    int n;
    cin >> n;

    for(int i = 0; i < n; i++){
        int k;
        cin >> k;
        v.push_back(k);
    }

    sort(v.begin(), v.end());
    
    for(int i = 0; i < n; i++){
        cout << v[i] << endl;
    }
}