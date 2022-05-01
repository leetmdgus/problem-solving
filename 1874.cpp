#include <iostream>
#include <windows.h>

using namespace std;
#define ARRAY_SIZE 100000

class Stack
{
public:
    Stack():top(-1){}
    ~Stack(){}

    void push(int element)
    {
        top++;
        array[top] = element;
        print_operate('+');

    }   
    int pop()
    {
        print_operate('-');
        return array[top--];
    } 

    int peek()
    {
        return array[top];
    }
    bool is_Emtpty()
    {
        return bool(top == 0);
    }
    void print_operate(char oper)
    {
        cout<<oper<<"\n";
    }

private:
    int top;
    int array[ARRAY_SIZE];

};

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin>>n;

    Stack s;

    int array[n];

    for(int i = 0; i<n; i++)
    {
        int num;
        cin>>num;

        array[i]=num;
    }

    int num = 0;    

    for(int index = 0; index<n; index++)
    {   
        while(num<n)
        {
            num++;
        
            if(array[index] == s.peek())
            {
                s.pop();
                break;
            }
            if(array[index]>s.peek())
            {
                s.push(num);
            }
            
        }   
    }

    if(s.is_Emtpty() != true)
        cout<<"NO";

        
    return 0;
}
