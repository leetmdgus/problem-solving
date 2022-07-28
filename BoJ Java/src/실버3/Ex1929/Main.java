package 실버3.Ex1929;

public class Main {
    // 필드
    int num; // (생성자 역할을 하는) 정수
    int sum; // d의 총합

    // 생성자
    Main(int num, int sum) {
        this.num = num;
        this.sum = sum;
    }

    // 메소드 1 - d(num과 num의 각 자릿수를 더한 숫자)를 구하고, d의 총합을 구해 주는 메소드
    public int d(int num) { // int 값으로 반환
        int sum = num; // num을 더해야 하기 때문에 sum = num 으로 초기화, sum이 다시 num이 됨
        // sum에다가 num의 각 자릿수를 더해주어야 하는데, 이것을 구현한 것이 이 while 루프
        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }

    // 메소드 2 - 셀프 넘버를 판별해주는 메소드
    public void selfNumCheck() {
        boolean[] check = new boolean[10001]; // 1~10000 사이의 셀프 넘버 구하기. 인덱스가 0부터 시작하기 때문에 배열 크기를 10001로 해야 함
        for (int i = 0; i < 10000; i++) {
            int selfNum = d(i);
            if (selfNum < 10001) {
                check[selfNum] = true;
            }
        }

        for (int i = 0; i < 10000; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main(0, 0);
        main.selfNumCheck();
    }
}