package Sets_And_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> words = new LinkedHashSet<>();

        for (int i = 1; i <=n ; i++) {
            String usernames = scanner.nextLine();
            words.add(usernames);
        }
        words.forEach(System.out::println);
    }
}
