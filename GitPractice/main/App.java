package main;

import java.util.Arrays;

public class App {
    //  methods
    public static int[] sortNum(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    // seperate method for strings
    public static String[] sortString(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

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
        sortNum(arr);
        sortString(words);
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
