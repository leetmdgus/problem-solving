#include <iostream>
#include <utility>
#include <vector>
#include <algorithm>

int main(void)
{    
    std::ios::sync_with_stdio(false);
    std::cin.tie(NULL);

    int number;
    std::cin >> number;

    std::vector<std::pair<int, std::string>> pair;
    
    for(int i = 0; i<number; i++) {
      int age;
      std::string name;
      std::cin >> age >> name;

      pair.push_back(make_pair(age, name));
    }

    std::sort(pair.begin(), pair.end());
    

    //버블 정렬 시간 초과
    // for(int i = 0; i<number-1; i++) {
    //   for(int j = 0; j<number-1; j++) {
    //       if(std::get<0>(pair[j]) > std::get<0>(pair[j+1])) {
    //           std::swap(pair[j], pair[j+1]);
    //       }
    //   }
      
    // }

    for(int i = 0; i<number; i++) {
      std::cout << std::get<0>(pair[i]) << " " << std::get<1>(pair[i]) << "\n";
    }
    
    return 0;
}