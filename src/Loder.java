import java.util.Arrays;
import java.util.Random;

public class Loder {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 10;
        System.out.print("a = ");
        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println("–––––––––––––––––––");
        int[]arr = {10, 10, 10, 10, 10, 10,10,10,10,10}; // int[]arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; ++i) {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println("–––––––––––––––––––");
        System.out.println("Первые 10 цифр гармонического ряда");
        double b = 1.0;
        while (b < 11) {
            System.out.println(1.0/b);
            b++;
        }
        System.out.println("–––––");
        for (double i = 0; i < 10; ++i) {
            double x = 1.0/(i + 1.0);
            System.out.println(x);
        }
        System.out.println("–––––––––––––––––––"); // 1 1/2 1/3 1/4
        System.out.println("Сгенерировать массив случайных целых чисел, вывести, отсортировать и вывести");
        int n = 10;
        int[]arr2 = new int[n];
        Random m = new Random();
        int mmas[]= new int[n];
        System.out.println("Случайный массив=");
        for (int i=0;i<n;i++){
            arr2[i] = m.nextInt(101);
            System.out.println( arr2[i]);
        }
        Arrays.sort(arr2);
        System.out.println("Отсортированный массив ="+ Arrays.toString(arr2));

    }
}
