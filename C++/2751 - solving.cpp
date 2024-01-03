#include <iostream>
#include <vector>

class Sort {
public:
    Sort(){}
    ~Sort(){}
    void divide(){

    }
    void conqure(){}
    bool isTwoOrOneElement(){}

private:

};
int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(NULL);
    int repeat;
    std::cin >> repeat;
    std::vector<int> v;
    while(repeat --) {
        int element;
        std::cin >> element;
        v.push_back(element);
    }
    
    return 0;
}