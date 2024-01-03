// 스택문제
// 균형잡힌 세상

#include <iostream>
#include <string>

#define ARRAY_SIZE 100
using namespace std;

class ArrayStack
{
public:
    ArrayStack(char bracket);
    ~ArrayStack();

    void Push(char bracket);    //bracket값을 스택에 삽입
    bool Is_VPS();

    void print_();
    

private:
    int top;
    char Stack[ARRAY_SIZE];

    char bracket;   //왼괄호
    int left_bracket;   //왼 괄호의 길이
    
    bool IsVPS;         //VPS라면 True
};

int main(void)
{
    while(true)
    {
        ArrayStack Stack_paren('(');   //소괄호 스택
        ArrayStack Stack_square('['); //대괄호 스택 

        string input;
        getline(cin, input);    // 공백 포함 입력

        if(input ==".")
            break;
        for(int i = 0; i<input[input.size()];i++)
        {
            if(input[i] == '('|| input[i] == ')')    
                Stack_paren.Push(input[i]);

            else if(input[i] == '['|| input[i] == ']')    
                Stack_square.Push(input[i]);
        }
        
        Stack_paren.print_();
        cout<<endl;
        Stack_square.print_();

        if(Stack_paren.Is_VPS() == true && Stack_square.Is_VPS() == true)
            cout<<"yes"<<endl;
        else   
            cout<<"no"<<endl;     
        
    }

    return 0;
}

ArrayStack::ArrayStack(char bracket):top(-1),bracket(bracket),IsVPS(true) {}

ArrayStack::~ArrayStack(){}

void ArrayStack::Push(char bracket)
{
    top++; 
    Stack[top] = bracket;
    
    if(bracket == bracket)
    {
        left_bracket++;
    }   
    else if(left_bracket > 0)
        left_bracket--;
    else
        IsVPS = false;  // 만약 '('보다 ')' 가 많다면 IsVPS는 false다.
    
}

bool ArrayStack::Is_VPS()
{   
    if(left_bracket != 0)
        IsVPS = false;
    
    if(IsVPS == false) // 만약 '('와 ')'의 개수가 같지 않다면 IsVPS는 false다.
        return false;
    else   
        return true;

}

void ArrayStack::print_()
{
    for(int i = 0; i<=top; i++)
        cout<<Stack[i]<<" ";
}