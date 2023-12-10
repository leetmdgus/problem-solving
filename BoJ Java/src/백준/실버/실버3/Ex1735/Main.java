package 백준.실버.실버3.Ex1735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Fountain a = new Fountain(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        Fountain b = new Fountain(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        Fountain ans;
        ans = a.add(b);
        ans = ans.abbreviation();

        System.out.println(ans.n + " " + ans.d);
    }

    static class Fountain {
        int d; // 분모 : denominator
        int n; // 분자 : numerator

        public Fountain(int n, int d) {
            this.d = d;
            this.n = n;
        }

        public Fountain() {
        }

        public Fountain add(Fountain other) {
            Fountain ans = new Fountain();
            ans.d = this.d * other.d;
            ans.n = this.n * other.d + this.d * other.n;
            return ans;
        }

        public Fountain abbreviation() {
            Fountain ans = new Fountain();
            int gcd = GCD(Math.max(this.n, this.d), Math.min(this.n, this.d));
            ans.d = this.d / gcd;
            ans.n = this.n / gcd;
            return ans;
        }
    }

    static int GCD(int n, int r) {
        if (r == 0) {
            return n;
        }
        return GCD(r, n % r);
    }
}
