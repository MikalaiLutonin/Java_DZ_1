
import java.util.Scanner;

public class DZ_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        DZ_1_4();

    }

    static void DZ_1_4() {

        // Реализовать простой калькулятор
        // ("введите первое число"... "Введите второе число"... "укажите операцию,
        // которую надо выполнить с этими числами"... "ответ: ...")
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();// рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();// рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());// рекурсия
        }
        return result;
    }

    static void DZ_1_3() {

        // Вывести все простые числа от 1 до 1000 (простые числа - это числа которые
        // делятся только на себя и на единицу без остатка.
        // Чтобы найти остаток от деления используйте оператор % , например 10%3 будет
        // равно единице)
        for (int i = 2; i <= 1000; i++) {
            boolean simple = false;

            for (int j = 2; j * j <= i; j++) {
                simple = (i % j == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(i + " ");
            }
        }
    }

    static void DZ_1_2() {

        // Вычислить n! (произведение чисел от 1 до n)

        System.out.println("ПРОГРАММА ВЫЧИСЛЯЕТ ПРОИЗВЕДЕНИЕ ЧИСЕЛ от 1 до n");
        System.out.print("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        for (int count = 1; count <= n; count++) {
            fact *= count;
        }
        System.out.print("Произведение чисел от 1 до " + n + " равно " + fact);
        scanner.close();
    }

    static void DZ_1_1() {

        // Вычислить n-ое треугольного число(сумма чисел от 1 до n)

        System.out.println("ПРОГРАММА ВЫЧИСЛЯЕТ СУММУ ЧИСЕЛ от 1 до n");
        System.out.print("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summ = 0;
        for (int count = 1; count <= n; count++) {
            summ += count;
        }
        System.out.print("Сумма чисел от 1 до " + n + " равна " + summ);
        scanner.close();
    }

}
