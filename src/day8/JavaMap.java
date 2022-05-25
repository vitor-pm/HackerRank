package day8;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;;

public class JavaMap {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> simpleMap = new HashMap<String, Integer>();

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            simpleMap.put(input[0], Integer.parseInt(input[1]));
        }

        while(scan.hasNext()){
            String s = scan.nextLine();
            Integer phoneNumber = simpleMap.get(s);
            System.out.println(
                (phoneNumber != null) 
                ? s + "=" + phoneNumber 
                : "Not found"
            );
        }
        scan.close();

    }
}
