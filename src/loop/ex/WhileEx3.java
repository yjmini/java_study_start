package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        int i = 1;

        while (i <= max) {
            sum = sum + i;
            i++;
        }
        System.out.println("//max=" + max);
        System.out.println(sum);
    }
}
