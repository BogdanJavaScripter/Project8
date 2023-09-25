public class part21 {

    public static void main(String[] args) {
        int[] array = {8, 9, 3, 23, 40};
        int sum = araysum(array, 0);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int araysum(int[] array, int i) {
        if (i >= array.length) {
            return 0;
        }
        return array[i] + araysum(array, i + 1);
    }
}