public class zad2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result = sum(a, b);
        System.out.printf("Сумма чисел %d и %d равна %d%n", a, b, result);
    }

    public static int sum(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return sum(a + 1, b - 1);
        }
    }
}