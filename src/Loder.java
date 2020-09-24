import java.util.Arrays;

public class Loder {
    public static void main(String[] args) {
        int[]arr = {11,11,11,11,11,11,11,11,11,11}; // int[]arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; ++i) {
            sum += arr[i];
        }
        System.out.println(sum);
        sum = 0;
        int j = 10;
        while (j != 0) {
            sum += arr[j - 1];
            --j;
        }
        System.out.println(sum);
        sum = 0; j = 0;
        do {
            sum += arr[j];
            ++j;
        } while (j < 10);
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
        int n = 5;
        double[]arr2 = new double[n];
        for (int i = 0; i < n; ++i) {
            arr2[i] = Math.random() * 100;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("–––––");
        for (int k = 0; k < n - 1; ++k) {
            for (int i = 0; i < n - 1; ++i) {
                if (arr2[i] < arr2[i + 1]) {
                    double tmp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("–––––––––––––––––––");
    }
}
