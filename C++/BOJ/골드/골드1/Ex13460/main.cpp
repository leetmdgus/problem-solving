#include <iostream>
#include <queue>
#include <vector>
#include <cmath>
using namespace std;
// 직사각형 보드에 빨간구슬과 파란구슬 존재
// 빨간구슬을 구멍을 통해 빼내는 게임
// 보드 : N*M
// 게임 진행 중 파란구슬이 구멍에 들어가면 안 된다. 

// 왼쪽으로 기울이기, 오른쪽으로 기울이기, 위쪽으로 기울이기, 아래쪽으로 기울이기 동작이 가능하다.
// 빨간 구슬과 파란구슬이 동시에 구멍에 빠지면 실패이다. 
// 빨간 구슬과 파란구슬은 동시에 같은 칸에 존재할 수 없다. 

// 최소 몇 번 만에 빨간 구슬을 구멍을 통해 빼낼 수 있는가?

// . : 빈칸
// # : 장애물
// O : 구멍
// R : 빨간 구슬
// B : 파란 구슬

// 빨간 구슬과 파란구슬은 각각 1개가 주어진다. 

// 10번 이하로 움직여서 빨간구슬을 구멍을 통해 빼낼 수 없으면 -1을 출력한다. 

// 현재 상태가 nowRX, nowRY, nowBX, nowBY일때, 각각 left, right, up, down했을때의 rx, ry, bx, by 반환환
vector<int> left(int nowRX, int nowRY, int nowBX, int nowBY); 
vector<int> right(int nowRX, int nowRY, int nowBX, int nowBY); 
vector<int> up(int nowRX, int nowRY, int nowBX, int nowBY); 
vector<int> down(int nowRX, int nowRY, int nowBX, int nowBY);
void print();

int n, m;
int rx, ry, bx, by, hx, hy;
char board[10][10];

int maxCnt = 0; 

int game() {
    queue<vector<int>> q;
    q.push({rx, ry, bx, by, 0});

    while(true) {
        vector<int> now = q.front();
        q.pop();

        rx = now[0];
        ry = now[1];
        bx = now[2];
        by = now[3];
        int cnt = now[4];
        // 10 회 초과시 -1 리턴
        if(cnt == 10) return -1;

        vector<int> moveLeft = left(rx, ry, bx, by);
        if(moveLeft.size() == 1 && moveLeft[0] == 1) {
            return cnt+1;
        } else if(moveLeft.size() != 1){
            moveLeft.push_back(cnt+1);
            q.push(moveLeft);
        }

        vector<int> moveRight = right(rx, ry, bx, by);
        if(moveRight.size() == 1 && moveRight[0] == 1) {
            return cnt+1;
        } else if(moveRight.size() != 1){
            moveRight.push_back(cnt+1);
            q.push(moveRight);
        }

        vector<int> moveUp = up(rx, ry, bx, by);
        if(moveUp.size() == 1 && moveUp[0] == 1) {
            return cnt+1;
        } else if(moveUp.size() != 1){
            moveUp.push_back(cnt+1);
            q.push(moveUp);
        }

        vector<int> moveDown = down(rx, ry, bx, by);
        if(moveDown.size() == 1 && moveDown[0] == 1) {
            return cnt+1;
        } else if(moveDown.size() != 1){
            moveDown.push_back(cnt+1);
            q.push(moveDown);
        }
    }

    return -1;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    cin >> n >> m;
    for(int i = 0; i<n; i++) {
        string str;
        cin >> str;
    
        for(int j = 0; j<m; j++) {
            board[i][j] = str[j];  
            if(board[i][j] == 'O') {
                board[i][j] = '.';
                hx = i;
                hy = j;
            }      
            if(board[i][j] == 'R') {
                board[i][j] = '.';
                rx = i;
                ry = j;
            } 
            if(board[i][j] == 'B' ) {
                board[i][j] = '.';
                bx = i;
                by = j;
            }
        }
    }
    cout << game() << endl;
    
    return 0; 
}

// print board;

// void print() {
//     cout <<"---------------"<<endl;
//     for(int i = 0; i<n; i++) {
//         for(int j= 0 ;j<m; j++ ){
//             cout << board[i][j] << ' ';
//         }
//         cout << endl;
//     }
// }


// R B . . . . 
// . . . . . .
// # # # . . .
// . . . . . .

vector<int> right(int nowRX, int nowRY, int nowBX, int nowBY) {
    int flag = 0; 
    int saveRX = nowRX, saveRY = nowRY, saveBX = nowBX, saveBY = nowBY;
    // 같은 행에 위치해 있고, R가 B보다 왼쪽에 위치할 때, 
    if(nowRX == nowBX && nowRY <= nowBY) {
        // 파란구슬을을 오른쪽으로 swap한다. 
        for(int j = nowBY; j<m-1; j++) {
            char next = board[nowBX][j+1];

            if(nowBX == hx && j+1 == hy) return {-1};
            if(next != '.' || (saveRX == saveBX && saveRY == j+1)) break;

            saveBY = j+1;
        }
        
        // 빨간 구슬을을 오른쪽으로 swap한다. 
        for(int j = nowRY; j<m-1; j++) {
            char next = board[nowRX][j+1];

            if(nowRX == hx && j+1 == hy) return {1};
            if(next != '.' || (saveRX == saveBX && j+1 == saveBY)) break;

            saveRY = j+1;
        }
    } else {
        // 빨간 구슬을을 오른쪽으로 swap한다. 
        for(int j = nowRY; j<m-1; j++) {
            char next = board[nowRX][j+1];

            if(nowRX == hx && j+1 == hy) flag = 1;
            if(next != '.' || (saveRX == saveBX && j+1 == saveBY)) break;

            saveRY = j+1;
        }
       // 파란구슬을을 오른쪽으로 swap한다. 
        for(int j = nowBY; j<m-1; j++) {
            char next = board[nowBX][j+1];

            if(nowBX == hx && j+1 == hy) return {-1};
            if(next != '.' || (saveRX == saveBX && saveRY == j+1)) break;
            
            saveBY = j+1;
        }
    }
    
    if(flag != 0) {
        return {flag};
    }

    return {saveRX, saveRY, saveBX, saveBY};
}
vector<int> left(int nowRX, int nowRY, int nowBX, int nowBY) {
    int flag = 0; 
    int saveRX = nowRX, saveRY = nowRY, saveBX = nowBX, saveBY = nowBY;
    // 같은 행에 위치해 있고, R가 B보다 왼쪽에 위치할 때, 
    if(nowRX == nowBX && nowRY <= nowBY) {
        // 빨간 구슬을을 왼쪽으로 swap한다. 
        for(int j = nowRY; j>=1; j--) {
            char next = board[nowRX][j-1];
            
            if(nowRX == hx && j-1 == hy) flag = 1;
            if(next != '.' || (saveRX == saveBX && j-1 == saveBY)) break;

            saveRY = j-1;
        }
        // 파란구슬을을 왼쪽으로 swap한다. 
        for(int j = nowBY; j>=1; j--) {
            char next = board[nowBX][j-1];          
            
            if(nowBX == hx && j-1 == hy ) return {-1};
            if(next != '.' || (saveRX == saveBX && saveRY == j-1)) break;

            saveBY = j-1;
        }
    } else {
        // 파란구슬을을 왼쪽으로 swap한다. 
        for(int j = nowBY; j>=1; j--) {
            char next = board[nowBX][j-1];

            if(nowBX == hx && j-1 == hy) return {-1};
            if(next != '.' || (saveRX == saveBX && saveRY == j-1)) break;

            saveBY = j-1;
        }
        // 빨간 구슬을을 왼쪽으로 swap한다. 
        for(int j = nowRY; j>=1; j--) {
            char next = board[nowRX][j-1];

            if(nowRX == hx && j-1 == hy) return {1};
            if(next != '.' || (saveRX == saveBX && j-1 == saveBY)) break;

            saveRY = j-1;
        }
    }

    if(flag != 0) {
        return {flag};
    }

    return {saveRX, saveRY, saveBX, saveBY};
}
vector<int> down(int nowRX, int nowRY, int nowBX, int nowBY) {
    int saveRX = nowRX, saveRY = nowRY, saveBX = nowBX, saveBY = nowBY;
    int flag = 0; 
    // 같은 열에 위치해있고, R이 B보다 위에 위치할 때
    if(nowRY == nowBY && nowRX <= nowBX) {
        // 파란 구슬이 움직인다. 
        for(int i = nowBX; i<n-1; i++){
            char next = board[i+1][nowBY];
            
            if(i+1 == hx && nowBY == hy) return {-1}; 
            if(next != '.' || (saveRX == i+1 && saveRY == saveBY)) break;

            saveBX = i+1;
        }

        // 빨간 구슬이 움직인다. 
        for(int i = nowRX; i<n-1; i++){
            char next = board[i+1][nowRY];
            
            if(i+1 == hx && nowRY == hy) return {1}; 
            if(next != '.' || (i+1 == saveBX && saveRY == saveBY)) break;
            
            saveRX = i+1;
        }
    } else {
        // 빨간 구슬이 움직인다. 
        for(int i = nowRX; i<n-1; i++){
            char next = board[i+1][nowRY];

            if(i+1 == hx && nowRY == hy) flag = 1; 
            if(next != '.' || (i+1 == saveBX && saveRY == saveBY)) break;
            
            saveRX = i+1;
        }
        // 파란 구슬이 움직인다. 
        for(int i = nowBX; i<n-1; i++){
            char next = board[i+1][nowBY];

            if(i+1 == hx && nowBY == hy) return {-1}; 
            if(next != '.' || (saveRX == i+1 && saveRY == saveBY)) break;

            saveBX = i+1;
        }
    }
    
    if(flag != 0) {
        return {flag};
    }
    return {saveRX, saveRY, saveBX, saveBY};
}
vector<int> up(int nowRX, int nowRY, int nowBX, int nowBY) {
    int saveRX = nowRX, saveRY = nowRY, saveBX = nowBX, saveBY = nowBY;

    int flag = 0; 
    // 같은 열에 위치해있고, R이 B보다 위에 위치할 때
    if(nowRY == nowBY && nowRX <= nowBX) {
        // 빨간 구슬이 움직인다. 
        for(int i = nowRX; i>=1; i--){
            char next = board[i-1][nowRY];

            if(i-1 == hx && nowRY == hy) flag = 1;
            if(next != '.' || (i-1 == saveBX && saveRY == saveBY)) break;
            
            saveRX = i-1;
        }
        // 파란 구슬이 움직인다. 
        for(int i = nowBX; i>=1; i--){
            char next = board[i-1][nowBY];

            if(i-1 == hx && nowBY == hy) return {-1};
            if(next != '.' || (saveRX == i-1 && saveRY == saveBY)) break;

            saveBX = i-1;
        }

    } else {
        // 파란 구슬이 움직인다. 
        for(int i = nowBX; i>=1; i--){
            char next = board[i-1][nowBY];

            if(i-1 == hx && nowBY == hy) return {-1};
            if(next != '.' || (saveRX == i-1 && saveRY == saveBY)) break;

            saveBX = i-1;
        }

        // 빨간 구슬이 움직인다. 
        for(int i = nowRX; i>=1; i--){
            char next = board[i-1][nowRY];

            if(i-1 == hx && nowRY == hy) return {1};
            if(next != '.' || (i-1 == saveBX && saveRY == saveBY)) break;
            
            saveRX = i-1;
        }
    }
    
    if(flag != 0) {
        return {flag};
    }
    return {saveRX, saveRY, saveBX, saveBY};
}