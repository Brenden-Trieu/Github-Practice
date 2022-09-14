import java.util.Arrays;

public class Scrap {
    public static void main(String args[]) {
        int[] arr = { 2, 15, 9, 45, 32, 8 };
        String[] words = { "McRib", "Acorn", "Net", "Computer" };

        System.out.println("Presorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (String i : words) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        Arrays.sort(arr);
        Arrays.sort(words);
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (String i : words) {
            System.out.print(i + " ");
        }
    }
}
