#include <iostream>

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int array[50]; // L 가 50보다 작거나 같으므로 그 이상 들어오지 않는다. 
    
    int x;
    cin>>x;
    for(int i = 0; i<x; i++)
    {
        cin>>array[i];
    }
    
    int n;
    cin>>n;

    int small_n = 0;    //n보다 작은수중 제일 큰 수
    int large_n = 1001;    //n보다 큰 수중 제일 작은 수

    for(int i = 0; i<x; i++)
    {
        if(array[i]<=n && array[i] >= small_n)  
        {//n보다 작은 수 중, 제일 큰 수
            small_n = array[i];
        }
        if(array[i]>=n && array[i] <= large_n)
        {//n보다 큰 수 중, 제일 작은 수
            large_n = array[i];
        }
    }

    int result = 0;

    //small_n 과 large_n 사이의 범위를 구한다.
    //n을 포함하는
    //만약 small_n이 4, large_n이 11, n이 7이라면
    //[5,7],[5,8],[5,9],[5,10],
    // [6,7],[6,8],[6,9],[6,10],
    // [7,8],[7,9],[7,10]
    
    for(int i = small_n+1; i<n; i++)
    {   //[5,7],[5,8],[5,9],[5,10],
        // [6,7],[6,8],[6,9],[6,10]을 구한다. 
        for(int j = n; j<large_n; j++)
        {
            result++;
        }
      }

    for(int i = n+1; i<large_n; i++)
    {   //[7,8],[7,9],[7,10]을 구한다.
        result++;
    }
    
    cout<<result<<"\n";
    return 0;
}