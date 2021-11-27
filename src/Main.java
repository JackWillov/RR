import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntNumber intNumber = new IntNumber(1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть числа для додавання : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Результат : ");
        System.out.println(intNumber.addNumbers(a, b));
        System.out.println("Введіть числа для віднімання : ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Результат : ");
        System.out.println(intNumber.minusNumbers(c, d));
        System.out.println("Введіть числа для множення : ");
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        System.out.println("Результат : ");
        System.out.println(intNumber.multiplyNumbers(e, f));
        System.out.println("Введіть числа для ділення : ");
        int g = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println("Результат : ");
        System.out.println(intNumber.divisionNumbers(g, h));
        System.out.println("Введіть число для перевірки на простоту : ");
        int k = scanner.nextInt();
        System.out.println("Результат : ");
        intNumber.checkSimpleNumber(k);

    }
}
