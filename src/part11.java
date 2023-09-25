public class part11 {

    public static void main(String[] args) {
        int n = 1;
        System.out.println("Printing numbers:");
        printNumber(n);
    }

    public static void printNumber(int n) {
        if (n >= 10) {
            return;
        }
        printNumber(n + 1);
        System.out.print(n + " ");
    }
}
