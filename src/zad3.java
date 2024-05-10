import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность целых чисел (введите 0 для завершения):");
        int sum = sumSequence(scanner);
        System.out.printf("Сумма последовательности: %d%n", sum);
    }

    public static int sumSequence(Scanner scanner) {
        int num = scanner.nextInt();
        if (num == 0) {
            return 0;
        } else {
            return num + sumSequence(scanner);
        }
    }
}
