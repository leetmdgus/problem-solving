#include <iostream>
#include <string>

using namespace std;

enum{zero, one, two, three, four, five, six, seven, eight, nine};

int main(void)
{
    int A,B,C;
    cin>>A>>B>>C;

    int ABC = A*B*C;

    string s_ABC = to_string(ABC);
    int num_array[10] = {0,};
    
    for(int i = 0; i<s_ABC.size(); i++)
    {
        char num = s_ABC[i];
        switch (num)
        {
        case '0':
            num_array[0]+=1;
            break;
        case '1':
            num_array[1]+=1;
            break;
        case '2':
            num_array[2]+=1;
            break;
        case '3':
            num_array[3]+=1;
            break;
        case '4':
            num_array[4]+=1;
            break;
        case '5':
            num_array[5]+=1;
            break;
        case '6':
            num_array[6]+=1;
            break;
        case '7':
            num_array[7]+=1;
            break;
        case '8':
            num_array[8]+=1;
            break;
        case '9':
            num_array[9]+=1;
            break;
        }
    }


    for(int i = 0; i<10; i++)
        cout<<num_array[i]<<"\n";


    return 0;
}