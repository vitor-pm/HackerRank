package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        String[] binary = Integer.toBinaryString(number).split("0");

        int maxSequence = 0;
        for (String sequence : binary) {
            if (sequence.length() > maxSequence)
                maxSequence = sequence.length();
        }

        System.out.println(maxSequence);
    }
}
