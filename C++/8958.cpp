#include <iostream>

using namespace std;

class stack
{
public:
    stack():o(0),score(0){}
    ~stack(){};

    void push(char result)
    {
        if(result == 'O')
        {
            o++;
            score += o;
        }
        else if(result == 'X')
        {   
            o = 0;
        }
    }

    int GetScore()
    {
        cout<<score<<"\n";
        return score;
    }

private:
    int o;
    int score;

};

int main(void)
{

    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int repeat;
    cin>>repeat;
    
    while(repeat--)
    {
        stack s;

        string result;
        cin>>result;

        for(int i = 0; i<result.size(); i++)
        {
            s.push(result[i]);
        }
        s.GetScore();
    }
    return 0;
}