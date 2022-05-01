#include <iostream>
#define DEFAULT_CAPACITY 1000000
#define DEFAULT_CARD_NUM 10
using namespace std;

class Queue
{
public:
    Queue();
    Queue(int capacity);
    ~Queue();

    int Pop();
    void SendBack();
    bool IsDefaultOneCard();
    bool IsTwoCard();

    int ShowCard();

private:
    int up, down;
    int capacity;
    int *array;
    int card_num;
};

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int card_num;
    cin>>card_num;

    Queue q(card_num);

    cout<<q.ShowCard()<<"\n";
    return 0;
}



Queue::Queue(): up(0), down(DEFAULT_CARD_NUM-1), card_num(DEFAULT_CARD_NUM)
{
    array = new int[DEFAULT_CAPACITY];
    for(int i = 0; i<card_num; i++)
    {
        array[i] = i+1;
    }
}
Queue::Queue(int card_num): up(0), down(card_num-1), card_num(card_num)
{
    array = new int[DEFAULT_CAPACITY];
    for(int i = 0; i<card_num; i++)
    {
        array[i] = i+1;
    }
    
}
Queue::~Queue()
{
    delete[] array;
}
int Queue::Pop()
{
    return array[up++];
}
void Queue::SendBack()
{
    array[++down] = array[up++];
}
bool Queue::IsTwoCard()
{
    return (up==down-1);
}
bool Queue::IsDefaultOneCard()
{
    return(card_num == 1);
}

int Queue::ShowCard()
{
    if(IsDefaultOneCard())
        return Pop();
    while(!IsTwoCard())
    {
        Pop();
        SendBack();
    }
    Pop();
    return Pop();
    
}
