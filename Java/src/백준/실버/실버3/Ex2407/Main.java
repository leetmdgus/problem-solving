package 백준.실버.실버3.Ex2407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static BigInteger dpCombi[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        dpCombi = new BigInteger[n+1][n+1];

        setDpCombination(n, m);

        System.out.println(dpCombi[n][m]);
    }
    public static void setDpCombination(int n, int m) {
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<=i; j++) {
                if(j == 0 || i == j) {
                    dpCombi[i][j] = BigInteger.ONE;
                } else {
                    dpCombi[i][j] = dpCombi[i-1][j-1].add(dpCombi[i-1][j]);
                }
            }
        }
    }
}