import java.util.Scanner;

public class factorial {
    static int calculation(int n) {
        int result = 1;
        for (int i = 1; i <= n; ++i) {
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Число для вычисления факториала: ");
        int x;
        Scanner scan = new Scanner (System.in);
        x = scan.nextInt();
        System.out.println(calculation(x));
    }
}
