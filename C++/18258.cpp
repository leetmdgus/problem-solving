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
    int *array;
};

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int repeat;
    cin>>repeat;

    Queue q;
    Queue result_q;
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
            result_q.Push(q.Pop());
        }
        else if(order == "size")
        {
            result_q.Push(q.Size());
        }
        else if(order == "empty")
        {
            result_q.Push(q.IsEmpty());
        }
        else if(order == "front")
        {   
            result_q.Push(q.GetFront());
        }
        else if(order == "back")
        {
            result_q.Push(q.GetBack());
        }
    }

    while(!result_q.IsEmpty())
    {
        cout<<result_q.Pop()<<"\n";
    }
    return 0;
}

Queue::Queue() : front(0), back(-1)
{
    array = new int[QUEUE_SIZE];
}
Queue::~Queue()
{ 
    delete[] array;
}

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
    return array[front];
}
int Queue::GetBack()
{
    if(IsEmpty())
        return -1;
    return array[back];
}