package day9;

import java.io.IOException;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(fatorial(n));
    }

    public static int fatorial(int n) {
        return n > 1 ? n * fatorial(n - 1) : n;
    }
}
