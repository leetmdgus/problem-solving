#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int n;
    cin >> n;
    int arr[100001];
    for(int i = 0;i <n; i++) {
        cin >> arr[i];
    }

    sort(arr, arr+n);

    int m;
    cin >> m;
    for(int i = 0; i<m; i++) {  
        int x;
        cin >> x;


        int start = 0; 
        int end = n-1; 
        bool flag = false;
        while(start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] < x) {
                start = mid + 1;
            } else if(arr[mid] > x) {
                end = mid - 1;
            } else {
                flag = true;
                break;
            }
        }

        if(flag) {
            cout << 1 << '\n';
        } else {
            cout << 0 << '\n';
        }
    }


    return 0; 
}