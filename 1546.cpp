#include <iostream>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int subject_count;
    cin>>subject_count;
    

    int M= -1;
    int M_index= -1;
    
    float array[subject_count] = {0,};

    for(int i = 0; i<subject_count; i++)
    {
        cin>>array[i];
        if(array[i]>M)
            M = array[i];
    }

    float arraysum=0;
    for(int i = 0; i<subject_count; i++)
    {
        arraysum += array[i]/M*100;
    }

    float average = arraysum/subject_count;

    cout.precision(5);
    cout<<fixed;
    cout<<average<<endl;

    return 0;
}