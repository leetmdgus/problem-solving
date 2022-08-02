package 실버4.Ex1018;


//import java.util.Scanner; // Scanner 임포트
//
//public class Main {
//    // 필드
//    static Scanner sc = new Scanner(System.in); // 정적 Scanner 생성
//    static int N = sc.nextInt(); // 보드의 세로 크기
//    static int M= sc.nextInt(); // 보드의 가로 크기
//    static char[][] chess= new char[N][M]; // M x N 크기의 정적 char형 배열 생성(보드의 크기)
//
//    Main(){};
//    // 메소드 1 - 알파벳 B, W를 받아 체스판을 만드는 메소드
//    public void makeChessBoardMethod() {
//
//        sc.nextLine(); // nextInt()나 next()의 경우 개행 기능이 없기에, N, M 입력 후 B, W를 받아 입력하려면 개행을 해주어야 함
//
//        /*
//        N은 주어지는 문자열의 수와 같고,
//        M은 한 문자열(ex: WBWBWBWB)의 길이와 같다.
//        */
//        for (int i = 0; i < N; i++) {
//            String s = sc.nextLine(); // 보드에 칠해진 색깔 한 줄을 N번 입력받기(ex: WBWBWBWB, BBBBBBBBWBWBW...)
//            for (int j = 0; j < M; j++) {
//                chess[i][j] = s.charAt(j);
//                /*
//                문자열 s = WBWBWBWB일 때
//                for (int j = 0; j < M; j++) {
//                chess[i][j] = s.charAt(j);
//                }
//                이 부분에서 charAt이 알파벳을 하나하나 꺼내와 chess배열에 넣어 준다.
//                이 부분이 N에서 입력받은 문자열에서 char를 하나씩 뽑아내 배열을 만드는 부분이다(j for문 전에는 아직 배열이 생성되지도 않은 상태).
//                */
//            }
//        }
//    }
//
//    // 메소드 2 - 체스판의 시작 인덱스를 골라주는 메소드
//    public void chessIndexMethod() {
//        int answer = Integer.MAX_VALUE;
//        for (int i = 0; i < N - 7; i++) {
//            for (int j = 0; j < M - 7; j++) {
//                answer = Math.min(answer, f(i, j));
//            }
//        }
//        System.out.println(answer);
//    }
//
//    /*
//    체스판을 잘라서
//    그 체스판의 첫 인덱스(i, j)를 f(i, j)에 넣어주고 칠해야 하는 정사각형 수를 반환한다.  f(i, j)
//    answer = Math.min(answer, f(i, j)) 그 결과를 answer과 비교해서 더 적게 칠한 수를 answer에 넣어 준다.
//    int paint  = f(i, j) 첫 인덱스(i, j)를 f(i, j)에 넣어주고 칠해야 하는 정사각형 수를 반환한다.
//    N= 8, M = 9
//    0번 행[0, 1, 2, 3, 4, 5, 6, 7, 8]
//    1번 행[0, 1, 2, 3, 4, 5, 6, 7, 8]
//    2번 행[0, 1, 2, 3, 4, 5, 6, 7, 8]
//    3번 행[0, 1, 2, 3, 4, 5, 6, 7, 8]
//    4번 행[0, 1, 2, 3, 4, 5, 6, 7, 8]
//    5번 행[0, 1, 2, 3, 4, 5, 6, 7, 8]
//    6번 행[0, 1, 2, 3, 4, 5, 6, 7, 8]
//    7번 행[0, 1, 2, 3, 4, 5, 6, 7, 8]
//    i가 행, j가 열이라 할때
//    위일때는 [0, 0], [0, 1] 이렇게 두 인덱스로 시작하는 체스 판으로 잘라낼 수 있다.
//    */
//
//    // 메소드 3 - 체스판의 첫 인덱스(i, j)를 받아서 칠해야 하는 정사각형 수를 반환하는 프로그램
//    public static int f(int x, int y) { // int x, int y는 각각 체스판의 첫 인덱스(i, j)를 의미
//        int B = 0; // B부터 시작할 때 다시 칠해야 하는 정사각형 수
//        int W = 0; // W부터 시작할 때 다시 칠해야 하는 정사각형 수
//
//        for (int i = x; i < x + 8; i++) {
//            for (int j = y; j < y + 8; j++) { // 이중 for문은 시작 인덱스에서 체스 판의 끝까지 훑는다는 의미
//                if((i + j) % 2 == 0) { // i + j가 짝수일 때
//                    if (chess[i][j] == 'B') {
//                        W++; // 만약 B라면 정사각형을 W로 칠해야 함
//                    } else {
//                        B++; // 만약 W라면 정사각형을 B로 칠해야 함
//                    }
//                } else { // (i + j) % 2 == 1) -> i + j가 홀수일 때
//                    if(chess[i][j] == 'W') {
//                        W++; // 만약 W라면 정사각형을 B로 칠해야 함
//                    }
//                    else {
//                        B++; // 만약 B라면 정사각형을 W로 칠해야 함
//                    }
//                }
//            }
//        }
//        return Math.min(B, W); // B, W 값 중 더 작은 값 출력
//    }
//
//    // 메인 메소드
//    public static void main(String[] args) {
//        Main main = new Main(); // Main 클래스 이용
//        main.makeChessBoardMethod(); // 메소드 1 호출
//        main.chessIndexMethod(); // 메소드 2 호출
//
//    }
//}