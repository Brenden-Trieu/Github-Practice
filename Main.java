import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int[] arr = { 15, 57, 4, 64, 11, 20, 41, 3 };

        System.out.println("Presorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("\n");
        Arrays.sort(arr);
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
