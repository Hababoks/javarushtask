public class Main {
    public static void main(String[] args) {
        int x = 0, sum = 0;
        while (x++ < 100) {

            if ((x % 3) == 0)
                continue;
            sum += x;
        }
        System.out.println(sum);
    }
}