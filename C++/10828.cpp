#include <iostream>
#define INT_MAX 2147483647
using namespace std;

// push X: 정수 X를 스택에 넣는 연산이다.
// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 스택에 들어있는 정수의 개수를 출력한다.
// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
// top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

void push(int *stack, int length, int num);
void pop(int *stack, int length);
void size(int *stack, int length);
int empty(int *stack, int length);
void top(int *stack, int length);

int main(void)
{
    int repeat;
    cin>>repeat;
    
    int stack[repeat];

    for(int i = 0; i<repeat;i++)
        stack[i] = INT_MAX; //배열 초기화

    int sLength = repeat-1; //배열 길이 얻음.
                            //= sizeof(stack)/sizeof(stack[0]);   

    while(repeat--)
    {
        string command;
        cin>>command;

        if(command == "push")
        {
            int commandNum;
            cin>>commandNum;
            push(stack, sLength, commandNum);

        }
        else if(command == "pop")
            pop(stack, sLength);
        
        else if(command == "size")
            size(stack, sLength);
        
        else if(command == "empty")
            empty(stack, sLength);
        
        else if(command == "top")
            top(stack, sLength);   
    }

    return 0;
}


void push(int *stack, int length, int num)
{
    for (int i = 0; i<length; i++)
    {
        int element = *(stack + i);
        if(element == INT_MAX)
        {   
            *(stack + i) = num;
            break;
        }
    }
}

void pop(int *stack, int length)
{
    if(*stack == INT_MAX)
    {
        cout<<-1<<endl;
    }
    else
    {
        int popNum;
        for(int i = 0; i<length; i++)
        {
            int element = *(stack + i);
            if(element == INT_MAX)
            {
                popNum = *(stack + i - 1);
                *(stack + i - 1) = INT_MAX;
                break;
            }
        }   
        cout<<popNum<<endl;
    }
}

void size(int *stack, int length)
{
    int size=0;
    for(int i = 0; i<length; i++)
    {
        int element = *(stack + i);
        if(element == INT_MAX)
            break;

        size++;
    }

    cout<<size<<endl;
}

int empty(int *stack, int length)
{
    if(*stack == INT_MAX)
    {
        cout<<1<<endl; return 1;
    }
    else   
    {
        cout<<0<<endl; return 0;       
    }
}

void top(int *stack, int length)
{
    if(*stack == INT_MAX)
    {
        cout<<-1<<endl;
    }
    else
    {
        int popNum;
        for(int i = 0; i<length; i++)
        {
            int element = *(stack + i);
            if(element == INT_MAX)
            {
                popNum = *(stack + i - 1);
                break;
            }
        }   
        cout<<popNum<<endl;
    }

}

