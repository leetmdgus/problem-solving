#include <iostream>
#include <queue>
#include <vector>
#include <algorithm>

using namespace std;
int n, m, k;

int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, 1, 0, -1};

int map[51][51] = {0, };

void bfs(int x, int y) {
    queue<pair<int, int>> q;
    q.push(make_pair(x, y));

    while(!q.empty()) {
        pair<int, int> now = q.front();
        q.pop();

        for(int i = 0; i<4; i++) {
            int nx = now.first + dx[i];
            int ny = now.second + dy[i];

            if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
            if(map[ny][nx] == 0) continue;

            map[ny][nx] = 0;
            q.push(make_pair(nx, ny));
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int t;
    cin >> t;

    while(t--) {
        for(int i = 0; i <=50; i++) {
            for(int j = 0;j <=50; j++) {
                map[i][j] = 0;
            }
        }
        
        cin >> m >> n >> k;
        
        int x, y;
        for(int i = 0; i<k ;i++) {
            cin >> x >> y;
            map[y][x] = 1;
        }

        int cnt = 0; 
        for(int i = 0; i<n ;i++) {
            for(int j = 0; j<m; j++) {
                if(map[i][j] == 1){
                    bfs(j, i);
                    cnt++;
                } 
            }
        }
        cout <<cnt<<'\n';
    } 

    return 0; 
}