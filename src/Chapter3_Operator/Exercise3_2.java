package Chapter3_Operator;

public class Exercise3_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A';//65

        System.out.println(y >= 5 || x< 0 && x > 2);//&&연산이 우선,부호 주의
        System.out.println(y += 10 -x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c<='Z'));
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

    }
}
