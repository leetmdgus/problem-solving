// std::cout.precision(6);
// std::cout  << std::fixed;
// std::cout.unsetf(ios::fixed);
#include <iostream>
using namespace std;

int main(void) {
    double A, B;
    cin >> A >> B;

    cout.precision(12);
    cout << fixed;
    cout << A / B;
    
    return 0; 
}