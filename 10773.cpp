//스택문제 
// 0을 부르면 최근 숫자를 지운다. 

#include <iostream>

using namespace std;

#define ARRAY_SIZE 100000

class ArrayStack
{
public:
    ArrayStack();
    ~ArrayStack();

    void Push(int money);    //item값을 스택에 삽입
    void Zero();

    int Sum_Stack();

private:
    int top;
    int Stack[ARRAY_SIZE];
};


int main(void)
{
    int repeat;
    cin>>repeat;

    ArrayStack stack;

    while(repeat--)
    {
        int money;
        cin>>money;

        if(money == 0)
            stack.Zero();
        else
            stack.Push(money);
    }
    
    cout<<stack.Sum_Stack()<<endl;

    return 0;    
}

ArrayStack::ArrayStack(): top(-1){}

ArrayStack::~ArrayStack(){}

void ArrayStack::Push(int money)
{
    top++; 
    Stack[top] = money;

}

void ArrayStack::Zero()
{
    Stack[top] = 0;         //top값 pop
    top--;  
}

int ArrayStack::Sum_Stack()
{
    if(top == -1)
        return 0;
    int sum = 0; 
    for(int index = 0; index<=top; index++)
        sum += Stack[index];
    
    return sum; 
}