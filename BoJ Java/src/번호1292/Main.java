package 번호1292;

//틀림
import java.util.Scanner;

public class Main {
    static String makeSequence(int length) {
        StringBuffer sequence = new StringBuffer();
        int len = 0;
        for(int i = 0; i<length+1; i++) {
            if(len == length) {
                break;
            }
            for(int j = 0; j<i; j++) {
                sequence.append(i);
            }
        }
        System.out.println(sequence);
        return sequence.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int last = sc.nextInt();

        String sequence = makeSequence(last);
        sequence = sequence.substring(start-1, last);

        int sum = 0;
        char[] seqenceArray = sequence.toCharArray();
        for(char seq : seqenceArray) {
            int numSeq = seq - '0';
            sum += numSeq;
        }
        System.out.println(sum);
    }
}
