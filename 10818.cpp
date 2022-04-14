//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.


#include <iostream>

using namespace std;

int main(void)
{
    int rep;
    cin>>rep;
    
    int userArr[rep];

    for(int i =0; i<rep;i++)    //userArr 초기화
    {
        int inputNum;
        cin>>inputNum;

        userArr[i] = inputNum;
    }   

    int MinNum = userArr[0];
    int MaxNum = userArr[0];

    for(int i = 0; i<rep; i++)
    {
        if(userArr[i]<MinNum)
        {
            MinNum = userArr[i];
        }
        if(userArr[i]>MaxNum)
        {
            MaxNum = userArr[i];
        }
    }

    cout<<MinNum<<" "<<MaxNum<<endl;


    return 0;
}