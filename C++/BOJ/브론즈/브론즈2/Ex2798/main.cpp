#include <iostream>
using namespace std;

int main(void){
    int n, m;
    cin >> n >> m;

    int arr[101];
    for(int i = 0; i<n ;i++) {
        cin >> arr[i];
    }

    int max = 0; 
    for(int i = 0; i<n; i++) {
        for(int j = i+1;j <n ;j++) {
            for(int k = j+1; k <n; k++) {
                int x = arr[i] + arr[j] + arr[k];

                if(x <= m) {    
                    max = max < x ? x : max; 
                }
            }
        }
    }

    cout << max;
    return 0; 
}