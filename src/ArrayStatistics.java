import java.util.Random;
public class ArrayStatistics {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10 - -10 + 1) + -10;
        }
        System.out.print("Array: ");

            for (int element : array) {
                System.out.print(element + " ");
            }
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("\nMinimum element: " + min);

        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Maximum element:: " + max);

        int count = 0;
        for (int element : array) {
            if (element < 0) {
                count++;
            }
        }
        System.out.println("Negative elements: " + count);

        count = 0;
        for (int element : array) {
            if (element > 0) {
                count++;
            }
        }
        System.out.println("Positive elements: " + count);

        count = 0;
        for (int element : array) {
            if (element == 0) {
                count++;
            }
        }
        System.out.println("Zero Count: " + count);
    }
}
