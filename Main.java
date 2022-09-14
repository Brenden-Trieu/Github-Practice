import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        String[] words = { "Zero", "Gwambus", "Robert", "Mwamba", "Armmy", "Agronomy" };
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

        System.out.println("Presorted Array: ");
        System.out.println();
        for (String i : words) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        Arrays.sort(words);
        System.out.println("Sorted Array: ");
        System.out.println();
        for (String i : words) {
            System.out.print(i + " ");
        }
    }
}
