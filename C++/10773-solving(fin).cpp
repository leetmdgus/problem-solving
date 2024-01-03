//스택문제  //10828 참조
// 0을 부르면 최근 숫자를 지운다. 


#include <iostream>
#include <vector>

using namespace std;

#define INT_MAX 2147483647

// push X: 정수 X를 스택에 넣는 연산이다.
// zero: 스택에서 가장 위에 있는 정수를 뺀다. 
// sum : 스택의 요소를 다 더하는 연산이다. 

void reset(int *stack, int length, int resetValue);
void push(int *stack, int length, int num);
void zero(int *stack, int length);
long long sum(int *stack, int length);

int main(void)
{
    int repeat;
    cin>>repeat;
    
    int stack[repeat];

    int length = repeat; //배열 길이 얻음.
                        //= sizeof(stack)/sizeof(stack[0]);   

    reset(stack, length, INT_MAX);
   
    while(repeat--)
    {
        int money;
        cin>>money;

        if(money == 0)
            zero(stack,length);
        else
            push(stack,length, money);
    }

    cout<<sum(stack,length);

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


void zero(int *stack, int length)
{  
    for (int i = 0; i<length; i++)
    {
        int element = *(stack + i);
        if(element == INT_MAX)
        {   
            *(stack+i-1) =INT_MAX;
            break;
        }
    }
}


long long sum(int *stack, int length)
{
    long long sum = 0;
    for(int i = 0; i<length; i++)
    {
        if(*(stack+i)==INT_MAX)
        {
            break;
        }
        int element = *(stack+i);
        sum += element;
    }
    return sum;
}


void reset(int *stack, int length, int resetValue)
{
    for(int i = 0; i<length;i++)
        *(stack+i) = resetValue; //배열 초기화
}