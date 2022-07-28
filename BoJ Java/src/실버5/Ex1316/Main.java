import java.util.Scanner; // Scanner 임포트

public class Main {
    // 필드
    static Scanner sc = new Scanner(System.in); // 정적 Scanner 생성
    int wordNum; // 그룹 단어의 개수. 그룹 단어가 N개일 것이다 라는 가정으로 출발함

    // 생성자
    Main(int wordNum) {
        this.wordNum = wordNum;
    } // 초기화

    // 메소드 - 입력받은 단어에서 그룹 단어의 개수를 출력해주는 메소드
    public void groupWordNumMethod() {
        int N = wordNum; // 그룹 단어의 개수를 확인하고 싶은 단어의 개수
        for (int i = 0; i < wordNum; i++) { // 각 단어를 search하는 부분
            String word = sc.next(); // 그룹 단어의 개수를 확인하고 싶은 단어 입력
            boolean[] arr = new boolean[26]; // 알파벳 개수(26) 크기의 boolean형 배열 선언

            for (int j = 0; j < word.length(); j++) { // 각 단어의 알파벳을 한 개씩 체크하여 그룹 단어인지 확인
                if (!arr[word.charAt(j) - 'a']) { // boolean은 초기값이 false이기 때문에 !false는 true이다
                    arr[word.charAt(j) - 'a'] = true; // 특정 알파벳이 등장하면 해당하는 인덱스를 true로 바꾸어 줌

                    /*
                    if (!arr[word.charAt(j) - 'a']) {
                    arr[word.charAt(j) - 'a'] = true;
                    }

                    이 if문의 뜻은 arr[word.charAt(j) - 'a']가 false일때 실행된다는 뜻이다.
                    실행된다는 것은, true라는 뜻.
                    xyxz 라는 단어의 경우
                    x -> true
                    y -> true로 순차적으로 실행됨(원래 값이 false였기에 가능).
                    그러나 세 번째 등장하는 x부터는 x값이 이미 true로 변해 있기 때문에
                    else if 문으로 넘어가게 됨.
                    */

                } else if (j > 0 && word.charAt(j) != word.charAt(j - 1)) {
                    wordNum--;

                    /*
                    xyz 라는 단어의 경우, 각 알파벳이 첫 등장하니 if문에 걸리게 됨.
                    그러나 xyxz 라는 단어의 경우, y와 세 번째 위치의 x는 달라짐. -> 세 번째 위치의 x 같은 경우 else if 문을 돌게 됨.
                    (두 번째 등장하는 알파벳이, 바로 직전 등장한 알파벳과 다르다면 그룹 단어가 아니게 됨).
                    */

                    /*
                    wordNum(그룹 단어의 개수)가 N개일 것이라는 가정으로 시작해서
                    if문을 통해
                    그룹 단어가 아닌 것을 wordNum--; 을 사용해 하나씩 줄여가는 구조.
                    */

                    break; // 반복문 종료 후 break
                }
            }
        }
        System.out.println(wordNum); // 그룹 단어의 개수 출력
    }

    // 메인 메소드
    public static void main(String[] args) {
        int wordNum = sc.nextInt(); // 그룹 단어의 개수를 확인하고 싶은 단어 입력
        Main main = new Main(wordNum); // Main 클래스 이용
        main.groupWordNumMethod(); // 메소드 호출
    }
}