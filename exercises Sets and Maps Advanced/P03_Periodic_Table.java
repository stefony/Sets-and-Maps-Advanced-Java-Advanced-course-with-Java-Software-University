package Sets_And_Maps_Advanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03_Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String input  = scanner.nextLine();
            String[] compound = input.split("\\s+");
            for (String element : compound) {
                set.add(element);
            }
        }

        for (String element : set) {
            System.out.print(element + " ");
        }
    }
}
