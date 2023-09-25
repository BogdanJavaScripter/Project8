public class part2 {

    public static void main(String[] args) {
        int[] array = {23, 4, 6, 20, 7};
        System.out.println("Printing array elements:");
        printarray(array, 0);
    }

    public static void printarray(int[] array, int i) {
        if (i >= array.length) {
            return;

        }
        System.out.print(array[i] + " ");
        printarray(array, i + 1);
    }
}
