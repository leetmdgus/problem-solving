#include <iostream>
#include <tuple>

int calculator(int, int);

int main(void)
{    
    std::ios::sync_with_stdio(false);
    std::cin.tie(NULL);
  
    int floor, room; 
    int NumberOfTestCases;

    std::cin >> NumberOfTestCases;

    while(NumberOfTestCases--) {
      std::cin >> floor >> room;
      std::cout << calculator(floor, room) << std::endl;

    }
    return 0;
}

int calculator(int floor, int room) {
  std::cout <<"floor: " << floor <<", room: "<< room <<std::endl;
  if(floor == 0 || room == 1) {
    std::cout<<"+++"<<std::endl;
    return room;
  } 
  return calculator(--floor, room) + calculator(floor, --room);
}


