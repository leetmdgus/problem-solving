package 실버5.Ex1181;

// 1 3 5 7 9 평균값 구하기 프로그램

public class Ex1181 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long aver = sum / nums.length;
        System.out.println(aver);
    }
}


//
//import java.util.*;
//
//public class Ex1181 {
//    // 필드
//    static Scanner sc = new Scanner(System.in); // 정적 Scanner 생성
//    static int N = sc.nextInt(); // 단어의 갯수 N
//    String[] arr = new String[N]; // N 크기의 배열 생성
//
//    // 메소드 1 - 배열 arr에 단어를 채워 주는 프로그램
//    public void addWordMethod() {
//        sc.nextLine(); // nextInt()나 next()의 경우 개행 기능이 없기에, 단어의 갯수 N을 입력받은 후 개행하여 단어를 입력받으려면 nextLine()을 써 주어야 한다
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextLine(); // 배열 arr에 N개만큼 단어 입력
//        }
//
//    }
//
//    // 메소드 2 - 단어들을 정렬한 후 출력해 주는 프로그램
//    public void arrayWordMethod() {
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // 단어 길이가 같을 경우
//                if (o1.length() == o2.length()) {
//                    return o1.compareTo(o2);    // 사전 순 정렬
//                }
//                return o1.length() - o2.length();
//            }
//        });
//
//        System.out.println(arr[0]);
//        for(int i = 0; i<N; i++) {
//            if(!arr[i].equals(arr[i-1])) {
//                System.out.println(arr[i]);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Ex1181 ex = new Ex1181();
//        ex.addWordMethod();
//        ex.arrayWordMethod();
//    }
//
//}