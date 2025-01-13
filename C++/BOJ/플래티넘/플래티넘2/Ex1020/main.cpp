#include <iostream>
#include <string>
#include <math.h>
using namespace std;

// 각 숫자를 표현하는데 필요한 세그먼트 수
int segments[10] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 5};

// 문자열을 숫자로 변환
long long strToNum(string& s) {
    long long ret = 0;
    for(char c : s) ret = ret * 10 + (c - '0');
    return ret;
}

// 숫자의 총 세그먼트 수 계산
int getSegmentCount(string& num) {
    int sum = 0;
    for(char c : num) {
        sum += segments[c - '0'];
    }
    return sum;
}

int main() {
    string num;
    cin >> num;
    int len = num.length();
    int targetSum = getSegmentCount(num);
    
    // 원래 수를 숫자로 변환
    long long original = strToNum(num);
    long long result = -1;
    
    // 현재 수부터 시작해서 모든 가능한 수를 확인
    for(long long i = 1; i <= 9999999999; i++) {
        long long next = (original + i) % (long long)pow(10, len);
        string nextStr = to_string(next);
        
        // 자릿수 맞추기
        while(nextStr.length() < len) {
            nextStr = "0" + nextStr;
        }
        
        if(getSegmentCount(nextStr) == targetSum) {
            result = i;
            break;
        }
    }
    
    cout << result << endl;
    return 0;
}