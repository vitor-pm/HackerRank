package day6;

import java.io.IOException;
import java.util.Scanner;

public class ReviewLoop {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        scanner.close();

        for (String word : arr) {
            char[] wo = word.toCharArray();
            for (int i = 0; i < wo.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(wo[i]);
                }
            }
            System.out.print(" ");
            for (int i = 0; i < wo.length; i++) {
                if (i % 2 != 0) {
                    System.out.print(wo[i]);
                }
            }
            System.out.print("\n");
        }

    }
}
