
#include<iostream>
#include <algorithm>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);cout.tie(0);

    int n; 
    cin >> n;
    long arr[2001];

    for(int i = 0; i<n; i++) {
        cin >> arr[i];
    }

    sort(arr, arr+n);

    int cnt = 0; 
    for(int i = 0; i<n; i++) {
        int start = 0;
        int end = n-1; 

        while(true) {
            if(start == i) start++;
            if(end == i) end--;

            if(start >= end) break;

            if(arr[start] + arr[end] < arr[i]) {
                start++;
            } else if(arr[start] + arr[end] > arr[i]) {
                end--;
            } else {
                cnt++;
                break;
            }
        }
    }

    cout << cnt;
    return 0; 
}