package Chapter4_if_for_while_switch;//continue문

public class Ex4_17 {
    public static void main(String[] args) {
        for(int i = 0; i <=10; i ++){
            if (i%3 ==0)
            continue;
            System.out.println(i);
        }
    }
}
