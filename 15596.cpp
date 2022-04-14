//정수 N개의 합 

#include <iostream>
#include <vector>

using namespace std;
long long sum(vector<int> &a) {
	long long ans = 0;
    int n = a.size();

    for(int i = 0; i<n; i++)
    {
        ans += a[i];   
    }
    
	return ans;
}



int main(void)
{
    vector<int> array{0,1,2,3,4};
    cout<<array.size()<<endl;

    cout<<sum(array)<<endl;

    return 0;
}