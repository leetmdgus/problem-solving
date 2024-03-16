#include <iostream>
#include <queue>
using namespace std;

struct Age {
    int idx, age;
    string name;
    Age(int idx, int age, string name ):idx(idx), age(age), name(name){}

    bool operator<(const Age o) const{
        if(this -> age == o.age) {
            return this->idx > o.idx;
        } else {
            return this->age > o.age;
        }
    }
};

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);
    int n;
    cin >> n;

    priority_queue<Age> pq;
    for(int i = 0;i <n; i++) {
        int age;
        string name;

        cin >> age >> name;

        pq.push({i, age, name});
    }

    while(!pq.empty()) {
        cout << pq.top().age << " " << pq.top().name << '\n';
        pq.pop();
    }

    return 0; 
}