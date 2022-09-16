
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] words = { "Zero", "Gwambus", "Robert", "Mwamba", "Armmy", "Agronomy" };
        int[] arr = { 15, 57, 4, 64, 11, 20, 41, 3 };

        System.out.println("\nPresorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (String i : words) {
            System.out.print(i + " ");
        }
        Arrays.sort(arr);
        Arrays.sort(words);
        System.out.println("\n\nSorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (String i : words) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
