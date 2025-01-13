#include <iostream>
#include <cmath>

using namespace std;

int arr[100][100];
bool visited[100][100];

int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, 1, 0, -1};

int n;
int m;

int dfs(int x, int y) {
    int res = 1; 
    for(int i = 0; i<4; i++){
        int nx = x + dx[i];
        int ny = y + dy[i];

        if(nx < 0 || ny < 0 || nx >= n || ny >= m ) continue;
        if(visited[nx][ny] || arr[x][y] != arr[nx][ny]) continue;

        visited[nx][ny] = true;
        res += (1 + dfs(x, y));
    }
    return res;
}

int power(char color) {
    int cnt = 0; 
    for(int i = 0; i<n; i++){
        for(int j = 0; j<m; j++){
            if(!visited[i][j] && arr[i][j] == color){
                visited[i][j] = true;
                cnt += pow(dfs(i, j), 2);
            }
        }
    }
    return cnt;
}

int main() {
    cin >> n >> m;

    for(int i = 0; i<n; i++){
        string str;
        cin >> str;
        for(int j= 0; j <m; j++){
            arr[i][j] = str[j];
        }
    }

    int enemy = power('B');
    int my = power('W');

    cout << my << ' ' << enemy;
    return 0; 
}