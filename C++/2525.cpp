#include <iostream>

using namespace std;

int main(void)
{
    int H,M;
    int time;

    cin>>H>>M>>time;

    if(time>=60)
    {   
        H += time/60;   //만약 time 이 180이라면 180/60=3 즉, 3만큼 H에 더한다.
    }

    if((M + time%60)>=60)   //time이 80이라면, time%60은 20이다. M+20이 60보다 크다면 
    {
        
        M = (M+time%60)-60;
        H++;
    } 
    else
    {
        M = M+time%60;
    }     
    
    if(H>23)
        H -= 24;  

    cout<<H<<" "<<M<<endl;

    return 0;
}