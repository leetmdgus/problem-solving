#include <iostream>

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int repeat;
    cin>>repeat;

    while(repeat--)
    {
        int studentnum;
        cin>>studentnum;
        int score[studentnum];
        for(int i = 0; i<studentnum; i++)
        {
            cin>>score[i];
        }

        float average=0;
        for(int i = 0; i<studentnum; i++)
            average +=  score[i];
        average /= studentnum;
        
        float averStudent = 0;
        for(int i = 0; i<studentnum; i++)
        {
            if(average<score[i])
                averStudent++;
        }
        float averStudentP = averStudent/studentnum*100;
        
        cout.precision(3);
        cout<<fixed;
        cout<<averStudentP<<"%"<<"\n";
    }
    return 0;
}