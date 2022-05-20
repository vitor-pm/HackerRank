package day1;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        i += Integer.parseInt(scan.nextLine());
        d += Double.parseDouble(scan.nextLine());
        s = s + scan.nextLine();
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
        scan.close();
    }
}
