#include <iostream>

using namespace std;

int main(void)
{
    //우리나라에서는 석가모니 입적(사망)한 해인기원전 544년을 기준으로 한다. 
    //이 문제의 기준인 태국에서는 543년을 기준으로 한다. 
    int B_year=2541;
    int AD_year;

    cin>>B_year;
    AD_year = B_year-543;
    cout<<AD_year<<endl;
    return 0;
}