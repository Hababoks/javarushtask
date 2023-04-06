import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");
//        Если числа разные — выводим в консоль фразу "Попробуй еще раз" и продолжаем поиск.
//
//                Для прерывания цикла используй оператор break.
//        Метод main() не участвует в тестировании.
//        checkNumber(3);
    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        boolean exit = false;
        while (!exit) {
            inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Загадочное число равно" + " " + inputNumber);
                break;
            } else {
                System.out.println("Попробуй еще раз");
            }
        }
    }
}

