public class part1 {

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Printing numbers:");
        printNumber(n);
    }

    public static void printNumber(int n) {
        if (n <= 0) {
            return;
        }
        printNumber(n - 1);
        System.out.print(n + " ");
    }
}


