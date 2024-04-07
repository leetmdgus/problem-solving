#include <iostream>
#include <vector>

using namespace std;

void swap(vector<long>& v, int idx1, int idx2) {
    long tmp = v[idx1];
    v[idx1] = v[idx2];
    v[idx2] = tmp;
}

int main(void) {
    int t;
    cin >> t;

    while(t--) {
        int n, k;
        cin >> n >> k;

        // 소 배열 입력받기
        vector<long> v;
        for(int i = 0;i <n ;i++) {
            long x; 
            cin >> x;
            v.push_back(x);
        }

        long ans;
        // 처음 인덱스랑 바꾼 후 battle
        int cnt1 = 0;
        swap(v, 0, k-1);
        for(int i = 1; i<n ;i++) {
            if(v[0] < v[i]) break;
            cnt1++;
        }
        swap(v, 0, k-1);

        // 가장 먼저 나온 큰 수랑 바꾼 후 battle
        int cnt2 = 0; 
        int idx = 0; 
        for(int i = 0; i<=k-1; i++) {
            if(v[i] >= v[k-1]) {
                idx = i;
                break;
            }
        }
    
        swap(v, k-1, idx);
        if(idx != 0) {
            cnt2++;
        }

        for(int i = idx+1; i<n; i++) {
            if(v[idx] < v[i]) break;
            cnt2++;
        }

        ans = max(cnt1, cnt2);
        cout << ans << endl;
    }   

    return 0; 
}