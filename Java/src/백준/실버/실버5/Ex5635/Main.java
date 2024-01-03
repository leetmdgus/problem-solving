package 백준.실버.실버5.Ex5635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Person> list = new ArrayList<>();
        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int date = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            list.add(new Person(name, year, month, date));
        }

        Collections.sort(list, (o1, o2) -> {
            if(o1.birthYear == o2.birthYear) {
                if(o1.birthMonth == o2.birthMonth) {
                    return o1.birthDate - o2.birthDate;
                }
                return o1.birthMonth - o2.birthMonth;
            }
            return o1.birthYear - o2.birthYear;
        });

        System.out.println(list.get(list.size()-1).name);
        System.out.println(list.get(0).name);

    }
}

class Person {
    String name;
    int birthYear;
    int birthMonth;
    int birthDate;

    public Person(String name, int birthYear, int birthMonth, int birthDate) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDate = birthDate;
    }
}
