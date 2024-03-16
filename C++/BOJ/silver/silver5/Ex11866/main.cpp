#include <iostream>
#include <queue>
using namespace std;

int main(void){
    queue<int> q;
    
    int n, k;
    cin >> n >> k;

    for(int i = 1; i<=n; i++) {
        q.push(i);
    }

    string str = "<";
    while(q.size() != 1) {
        for(int i = 0; i<k-1 ;i++) {
            int x = q.front();
            q.pop();
            q.push(x);
        }
        str += to_string(q.front()) + ", ";
        q.pop();
    }

    str+= to_string(q.front());
    q.pop();
    str += ">";

    cout << str << endl;
    return 0; 
}