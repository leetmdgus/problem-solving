#include <iostream>

using namespace std;

class Queue {
public:
  Queue(): head(0), tail(-1), arraySize(0) {}
  ~Queue() {
    head = 0; 
    tail = -1;
    arraySize = 0;
  }

  void excute(string command) {
    if(command == "push"){
        push();
      } else if(command == "pop") {
        cout << pop() << "\n";
      } else if(command == "size") {
        cout << size() << "\n";
      } else if(command == "empty") {
        cout << isEmpty() << "\n";
      } else if(command == "front") {
        cout << front() << "\n";
      } else if(command == "back") { 
        cout << back() << "\n";
      }
  }
private:
  void push() {
    int element; 
    cin>>element;
    arraySize++;
    array[++tail] = element;
  }
  int pop() {
    if(isEmpty() == 1) {
      return -1;
    }
    arraySize--;
    return array[head++];
  }
  
  int size() {return arraySize;}
  int isEmpty() {return arraySize==0?1:0;}
  int front()
  {
    return isEmpty()==1 ? -1 : array[head];
  }
  int back()
  {
    return isEmpty()==1 ? -1 : array[tail];
  }

private:
  int array[10000];
  int head, tail;
  int arraySize;
};
int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int repeat;
    cin>>repeat;

    Queue q;
    while(repeat--) {
      string command;
      cin>>command;
      
      q.excute(command);
    }

    return 0;
}