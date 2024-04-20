package Sets_And_Maps_Advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,String> book = new HashMap<>();

        while (!input.equals("search")){
            String name = input.split("-")[0];
            String phone = input.split("-")[1];
            book.put(name,phone);

            input= scanner.nextLine();
        }
        String names = scanner.nextLine();
        while (!names.equals("stop")){
            if (book.containsKey(names)){
                System.out.println(names + " -> " + book.remove(names));
            }else {
                System.out.printf("Contact %s does not exist.%n", names);
            }
            names= scanner.nextLine();
        }
    }
}
