package 백준.실버.실버5.Ex8979;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        PriorityQueue<CountryMedal> heap = new PriorityQueue<>((o1, o2) -> {
            if(o1.gold == o2.gold) {
                if(o1.silver == o2.silver) {
                    return o2.bronze - o1.bronze;
                }
                return o2.silver - o1.silver;
            }
            return o2.gold - o1.gold;
        });

        for(int i = 0; i<n; i++) {
            st= new StringTokenizer(br.readLine());
            heap.add(new CountryMedal(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        int rank = 1;
        int same = 1;
        CountryMedal country = heap.poll();
        while(!heap.isEmpty()) {
            if(country.countryNum == k) {
                break;
            }

            CountryMedal nextCountry = heap.poll();
            if(country.equals(nextCountry)) {
                same++;
            } else {
                rank += same;
                same = 1;
            }

            country = nextCountry;
        }

        System.out.println(rank);
    }
}

class CountryMedal {
    public int countryNum;
    public int gold;
    public int silver;
    public int bronze;

    CountryMedal(int countryNum, int gold, int silver, int bronze) {
        this.countryNum = countryNum;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    boolean equals(CountryMedal countryMedal) {
        return(this.gold == countryMedal.gold && this.silver == countryMedal.silver && this.bronze == countryMedal.bronze);
    }
}