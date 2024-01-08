#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool compare(string str1, string str2) {
    return str2+str1 < str1+str2;
}

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    vector<string> strVector;
    vector<long> longVector;

    int K, N;
    cin >> K >> N;

    for(int i = 0; i<K ;i++) {
        long element;
        cin >> element;
        longVector.push_back(element);
    }

    sort(longVector.rbegin(), longVector.rend());

    for(int i = 0; i<K; i++) {
        strVector.push_back(to_string(longVector[i]));
    }

    while(strVector.size() < N) {
        strVector.push_back(to_string(longVector[0]));
    }

    sort(strVector.begin(), strVector.end(), compare);

    for(int i = 0; i<N; i++) {
        cout << strVector[i];
    }
    return 0; 
}