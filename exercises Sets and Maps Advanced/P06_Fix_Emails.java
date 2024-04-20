package Sets_And_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Map<String,String> data = new LinkedHashMap<>();

        while (!name.equals("stop")){
            String email = scanner.nextLine();
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")){

                data.put(name,email);
            }
            name= scanner.nextLine();
        }
        data.entrySet().forEach(entry->System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
