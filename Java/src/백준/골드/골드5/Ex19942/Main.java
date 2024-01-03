package 백준.골드.골드5.Ex19942;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static int n;
    public static int[][] arr;
    public static int[] standard;
    public static boolean[] visited;

    public static int pay = Integer.MAX_VALUE;
    public static TreeSet<String> set = new TreeSet();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][5];
        visited = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        standard = new int[4];
        for(int i = 0; i<4; i++) {
            standard[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i<=n; i++) {
            dfs(i,0, 0);
        }

        System.out.println(pay == Integer.MAX_VALUE ? -1 : pay + "\n" + set.first());
    }

    public static void dfs(int m, int depth, int start) {
        if(depth == m) {
            int num = check();
            StringBuilder sb = new StringBuilder();
            if(num < pay && num != -1) {
                pay = num;
                for(int i = 0; i<n;i++) {
                    if(visited[i]) {
                        sb.append(i+1 + " ");
                    }
                }
                set = new TreeSet<>();
                set.add(sb.toString());

            } else if(num == pay) {
                for(int i = 0; i<n;i++) {
                    if(visited[i]) {
                        sb.append(i+1 + " ");
                    }
                }
                set.add(sb.toString());
            }
            return;
        }

        for(int i = start; i< n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(m, depth+1, i+1);
                visited[i] = false;
            }
        }
    }

    private static int check() {
        int[] pfsv = new int[5];
        for(int i = 0; i< visited.length; i++) {
            if(visited[i]) {
                for(int j = 0; j<5; j++) {
                    pfsv[j] += arr[i][j];
                }
            }
        }

        for(int i = 0; i<4; i++) {
            if(pfsv[i] < standard[i]) {
                return -1;
            }
        }

        return pfsv[4];
    }
}