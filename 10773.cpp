#include <iostream>
#include <string>
#define STACK_SIZE 100000
#define INT_MAX 2147483647

using namespace std;

int strcompare(char *,char *); void push(int *); int pop(int *); int size(int *);int empty(int *); int top(int *); 
int stack[STACK_SIZE]={0, };

int zero(int *);

int main(){
    int rep, p, money;
    
    cin>>rep;//몇 회 명령을 입력받을 것인지 확인.
    
    while(rep--){//rep==0일때 while문 종료.
        cin>>money;//push, pop, size, empty, top 입력 받음. 
        if(money==0){//정수 X를 스택에 넣는 연산이다.
            zero(stack);      
        }
        else
        {
            push(stack);
        }
    }
    return 0;
}

int size(int *stack){//정수의 개수를 출력하는 함수.
    int number =0;
    while(stack[number]) //stack[i]==NULL일때, 종료.
        number ++; 
    return number;
}

void push(int *stack){
    int num,j;
    cin>>num;
    
    for(j =0;j<STACK_SIZE;j++){
        if(stack[j]==0){
            stack[j]=num;
            break;
        } 
    }
}

int pop(int *stack){
    int s, pop_s;
    s = size(stack);
    if(s==0) return -1;
    else{
        s=s-1;
        pop_s = stack[s];
        stack[s]=0;
        return pop_s;
    }

}


int empty(int *stack){//스택이 비어있으면 1, 비어있지 않으면 0을 출력한다.
    int s;
    s = size(stack);
    if(s==0) return 1;
    else return 0;
}

int top(int *stack){
    int s, top_;
    s = size(stack);
    if(s==0)
        return -1;
    else{
        s= s-1;
        top_ = stack[s];
        return top_;
    }
}