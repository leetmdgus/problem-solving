package 백준.골드.골드5.Ex1041;

// N:1, -> 1
// N:2, -> 8
// N:3, -> 27

//      +----+
//      | D  |
// +----+----+----+----+
// | E  | A  |  B |  F |
// +----+----+----+----+
//      | C  |
//      +----+


//      +----+
//      | 6  |
// +----+----+----+----+
// | 7  | 10  |  8 |  4 |
// +----+----+----+----+
//      | 4  |
//      +----+


// N == 1
// 앞면
// {5}

// N == 2
// 앞면        윗면     오른쪽   왼쪽    뒷면     아랫면
// {3}{3}     {3}{3}  {3}{3}  {3}{3}  {3}{3}  {0}{0}
// {2}{2}     {3}{3}  {2}{2}  {2}{2}  {2}{2}  {0}{0}

// N == 3
// 앞면           윗면       오른쪽       왼쪽        뒷면           아랫면
// {3}{2}{3}     {3}{2}{3}  {3}{2}{3}  {3}{2}{3}  {3}{2}{3}    {0}{0}{0}
// {2}{1}{2}     {2}{1}{2}  {2}{1}{2}  {2}{1}{2}  {2}{1}{2}    {0}{0}{0}
// {2}{1}{2}     {3}{2}{3}  {2}{1}{2}  {2}{1}{2}  {2}{1}{2}    {0}{0}{0}


// 3면이 보이거나 두면이 보이거나 1면이 보이거나.
// 윗면전부 + 오른쪽 왼쪽 앞 뒤 가운데 부분 + 기둥부분

// 윗부분 모서리는 항상 3이다.
// 아랫부분 모서리는 항상 2이다.
// 모서리 사이 선분은 항상 2이다.
// 끼어있는 가운데 부분은 항상 1이다.

// 꼭짓점 총 8개
// 3개 일때 경우의 수
//       _______
//     /   D  / |
//    --------  | F
//  E |  A   |B |
//    |      | /
//     -------
//       C

// 3개 일때 경우의 수 8
// ABC ABD ACE ADE
// FBC FBD
// FDE FCE

// 2개일때 경우의 수 12
// AB AC AD AE
// FB FC FD FE
// BC BD CE DE


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static final BigInteger TWO = new BigInteger("2");
    public static final BigInteger FOUR = new BigInteger("4");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Cube cube = new Cube(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());

        if (n.equals(BigInteger.ONE)) { // BigInteger.ONE 과 "1"은 같지 않음.
            BigInteger max = cube.A.max(cube.B).max(cube.C).max(cube.D).max(cube.E).max(cube.F);
            System.out.println(cube.A.add(cube.B).add(cube.C).add(cube.D).add(cube.E).add(cube.F).subtract(max));
            return;
        } else if (n.equals(TWO)) {
            System.out.println(cube.minThree.multiply(FOUR).add(cube.minTwo.multiply(FOUR)));
            return;
        }

        BigInteger nMinusTwo = n.subtract(TWO);
        BigInteger nMinusOne = n.subtract(BigInteger.ONE);

        BigInteger upperSum = FOUR.multiply(cube.minThree) // 꼭지점
                .add(FOUR.multiply(nMinusTwo).multiply(cube.minTwo)) // 사이드
                .add(nMinusTwo.multiply(nMinusTwo).multiply(cube.minOne)); // 안쪽
        BigInteger sideSum = nMinusTwo.multiply(nMinusOne).multiply(cube.minOne); // 안쪽
        BigInteger column = nMinusOne.multiply(cube.minTwo);//기둥

        System.out.println(upperSum
                          .add(FOUR.multiply(sideSum))
                          .add(FOUR.multiply(column)));
    }
}

class Cube {
    BigInteger A, B, C, D, E, F;
    BigInteger minOne;
    BigInteger minTwo;
    BigInteger minThree;

    public Cube(String a, String b, String c, String d, String e, String f) {
        A = new BigInteger(a);
        B = new BigInteger(b);
        C = new BigInteger(c);
        D = new BigInteger(d);
        E = new BigInteger(e);
        F = new BigInteger(f);
        setMin();
    }

    private void setMin() {
        // 1개일때
        minOne = A.min(B).min(C).min(D).min(E).min(F);

        // 2개일때 경우의 수 12
        // AB AC AD AE
        // FB FC FD FE
        // BC BD CE DE
        BigInteger AB = A.add(B), AC = A.add(C), AD = A.add(D), AE = A.add(E);
        BigInteger FB = F.add(B), FC = F.add(C), FD = F.add(D), FE = F.add(E);
        BigInteger DB = D.add(B), BC = B.add(C), CE = C.add(E), DE = D.add(E);

        minTwo = AB.min(AD).min(AE).min(AC).min(DB).min(BC).min(CE).min(DE).min(FD).min(FB).min(FC).min(FE);

        // 3개 일때 경우의 수 8
        // ABC ABD ACE ADE
        // FBC FBD
        // FDE FCE
        BigInteger ABC = A.add(B).add(C), ABD = A.add(B).add(D), ACE = A.add(C).add(E), ADE = A.add(D).add(E);
        BigInteger FBC = F.add(B).add(C), FBD = F.add(B).add(D);
        BigInteger FDE = F.add(D).add(E), FCE = F.add(C).add(E);

        minThree = ABC.min(ABD).min(ACE).min(ADE).min(FBC).min(FBD).min(FDE).min(FCE);
    }
}
