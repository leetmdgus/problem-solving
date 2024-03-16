#include <iostream>
#include <map>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    map<int, int> map;
    int n;
    cin >> n;
    for(int i = 0; i<n; i++) {
        int x;
        cin >> x;
        
        if(map.find(x) == map.end()) {
            map.insert(make_pair(x, 1));
        } else {
            int val = map.find(x) -> second +1;
            map.erase(x);
            map.insert(make_pair(x, val));
        }
    }

    int m;
    cin >> m;
    string str = "";
    for(int i = 0; i<m; i++) {
        int x;
        cin >> x;

        if(map.find(x) == map.end()) str += "0 ";
        else str += to_string(map.find(x)->second) + " ";
    }

    cout <<str << endl;
    return 0; 
}