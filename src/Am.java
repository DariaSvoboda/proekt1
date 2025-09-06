import java.util.Scanner;

public class Am {

    public static int am1(int a, int b) {
        int result = 0;
        int sign = (a < 0 ^ b < 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);

        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result * sign;
    }

    public static int am2(int a, int b) {
        int result = 0;
        int sign = (a < 0 ^ b < 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);

        int i = 0;
        while (i < b) {
            result += a;
            i++;
        }
        return result * sign;
    }

    public static int am3(int a, int b) {
        if (b == 0) return 0;
        if (b > 0) return a + am3(a, b - 1);
        return -am3(a, -b);
    }

    public static int am4(int a, int b) {
        int result = 0;
        int sign = (a < 0 ^ b < 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);

        while (b > 0) {
            if (b % 2 == 1) {
                result += a;
            }
            a *= 2;
            b /= 2;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = sc.nextInt();

        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        System.out.println("\nРезультаты разными способами:");
        System.out.println("Способ 1: " + am1(a, b));
        System.out.println("Способ 2: " + am2(a, b));
        System.out.println("Способ 3: " + am3(a, b));
        System.out.println("Способ 4: " + am4(a, b));
    }
}
