//스택문제
//괄호
#include <iostream>
#include <string>

#define ARRAY_SIZE 100
using namespace std;

class ArrayStack
{
public:
    ArrayStack();
    ~ArrayStack();

    void Push(char item);    //item값을 스택에 삽입
    void Is_VPS();
    

private:
    int top;
    char Stack[ARRAY_SIZE];

    int left_parenthesis;   //'('의 길이
    bool IsVPS;         //VPS라면 True
};

int main(void)
{
    int repeat;
    cin>>repeat;

    while(repeat--)
    {
        ArrayStack PS;
        string input;
        cin>>input;

        for(int i = 0; i<input.size();i++)
            PS.Push(input[i]);
        PS.Is_VPS();
    }
    return 0;
}

ArrayStack::ArrayStack():top(-1),left_parenthesis(0),IsVPS(true) {}

ArrayStack::~ArrayStack(){}

void ArrayStack::Push(char item)
{
    top++; 
    Stack[top] = item;
    if(item == '(')
    {
        left_parenthesis++;
    }   
    else if(left_parenthesis > 0)
        left_parenthesis--;
    else
        IsVPS = false;  // 만약 '('보다 ')' 가 많다면 IsVPS는 false다.
    
}

void ArrayStack::Is_VPS()
{   
    if(left_parenthesis != 0)
        IsVPS = false;
    
    if(IsVPS == false) // 만약 '('와 ')'의 개수가 같지 않다면 IsVPS는 false다.
        cout<<"NO"<<endl;
    else   
        cout<<"YES"<<endl;

}