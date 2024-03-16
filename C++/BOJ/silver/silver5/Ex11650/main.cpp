#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class XY {
public:
    int x, y;
    XY (int x, int y){
        this -> x = x;
        this -> y = y;
    }
    
    void print() {
        cout << x << " " << y << '\n';
    }
};

bool compare(XY xy1, XY xy2) {
    if(xy1.x == xy2.x) {
        return xy1.y < xy2.y;
    } else {
        return xy1.x < xy2.x;
    }
}


int main(void) {
    int n;
    cin >> n;

    vector<XY> v;
    for(int i = 0; i<n; i++) {
        int x, y;
        cin >> x >> y;

        v.push_back(XY(x, y));
    }

    sort(v.begin(), v.end(), compare);
    for(int i = 0; i<n; i++) {
        v[i].print();
    }

    return 0; 
}

