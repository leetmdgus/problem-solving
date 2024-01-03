#include <iostream>

#define QUEUE_SIZE 2000000
using namespace std;

// push X
// pop
// size
// empty
// front
// back

class Queue
{
public:
    Queue();
    ~Queue();

    void Push(int x);
    int Pop();
    int Size();
    bool IsEmpty();
    int GetFront();
    int GetBack();

private:
    int front, back;
    int array[QUEUE_SIZE];
};

int main(void)
{    
    
    int repeat;
    cin>>repeat;

    Queue q;
    while(repeat--)
    {
        string order;
        cin>>order;

        if(order == "push")
        {
            int x;
            cin>>x;
            q.Push(x);
        }
        else if(order == "pop")
        {
            cout<<q.Pop()<<endl;
        }
        else if(order == "size")
        {
            cout<<q.Size()<<endl;
        }
        else if(order == "empty")
        {
            cout<<q.IsEmpty()<<endl;
        }
        else if(order == "front")
        {   
            cout<<q.GetFront()<<endl;
        }
        else if(order == "back")
        {
            cout<<q.GetFront()<<endl;
        }
    }

    return 0;
}

Queue::Queue() : front(0), back(-1){ }
Queue::~Queue(){ }

void Queue::Push(int x)
{
    array[++back] = x;
}
int Queue::Pop()
{
    if(IsEmpty())
        return -1;
    
    return array[front++];
}

int Queue::Size()
{
    int size = back-front+1;
    return size;
}
bool Queue::IsEmpty()
{  
    return (front>back);
}
int Queue::GetFront()
{
    if(IsEmpty())
        return -1;
    return front;
}
int Queue::GetBack()
{
    if(IsEmpty())
        return -1;
    return back;
}