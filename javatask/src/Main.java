import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inputNumber;
        int number =0;
        while (true) {
            inputNumber = scn.nextInt();
            if (inputNumber == number) {
                System.out.println("Загадочное число равно " + inputNumber);
                break;
            } else System.out.println("Попробуй еще раз");
        }
    }
}