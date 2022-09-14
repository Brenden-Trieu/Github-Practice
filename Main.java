import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        String[] words = { "Zero", "Gwambus", "Robert", "Mwamba", "Armmy", "Agronomy" };

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
