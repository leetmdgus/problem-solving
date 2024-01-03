package 백준.실버.실버1.Ex19699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[] prime; // 0 : nothing, -1: no prime 1 prime
    public static int[] arr;
    public static boolean[] visited;
    public static int n, m;
    public static Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];

        int sum = 0;
        st = new StringTokenizer(br.readLine());

        for(int i =0; i<n ;i++) {
           arr[i] = Integer.parseInt(st.nextToken());
           sum += arr[i];
        }

        prime = new int[sum + 1];

        dfs(0, 0);

        if(set.size() == 0) {
            System.out.println(-1);
        } else {
            Iterator<Integer> iter = set.iterator();
            while(iter.hasNext()) {
                System.out.print(iter.next() + " ");
            }
        }
    }

    public static void dfs(int sum, int depth) {
        if(m == depth) {
            if(isPrime(sum)) {
                set.add(sum);
            }
            return;
        }

        for(int i = 0; i<n ;i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(sum + arr[i], depth+1);
                visited[i] = false;
            }
        }
    }

    public static boolean isPrime(int n) {
        if(prime[n]==1) return true;

        for(int i = 2; i<=n; i++) {
            for(int j = i*i ; j<=n; j+=i) {
                prime[j] = -1;
            }
        }

        prime[n] = prime[n] == -1 ? -1 : 1;
        return prime[n] == 1;
    }
}
