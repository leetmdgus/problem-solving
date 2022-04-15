#include <iostream>

using namespace std;
class SoSimple
{
private:
    int num1;
public: 
    SoSimple(int n1) : num1(n1)
    { }
    SoSimple(const SoSimple &copy): num1(copy.num1)
    {
        cout<<"Called SoSimple(SoSimple &copy)"<<endl;
    }
    SoSimple & AddNum(int n)
    {
        num1 += n;
        return *this;
    }
    void ShowDate()
    {
        cout<<"num1: "<<num1<<endl;
    }
};


SoSimple SimpleFuncObj(SoSimple ob)
{
    cout<<"return ÀÌÀü"<<endl;
    return ob;
}

int main(void)
{
    SoSimple obj(21);
    SimpleFuncObj(obj).AddNum(30).ShowDate();
    obj.ShowDate();
    obj.AddNum(20).AddNum(20).AddNum(30);
    return 0;
}