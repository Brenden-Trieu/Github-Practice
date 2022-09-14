import java.lang.reflect.Array;
import java.util.Arrays;

public class A1 {
    public static void main(String args[]) {
        int[] arr = { 2, 15, 9, 45, 32, 8 };
        String[] words = { "McRib", "Acorn", "Net", "Computer" };

        System.out.println("Presorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
