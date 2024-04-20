package Sets_And_Maps_Advanced;

import java.util.Scanner;
import java.util.TreeMap;

public class P04_Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        TreeMap<Character,Integer> symbol = new TreeMap<>();

        for (int i = 0; i < text.length() ; i++) {
            char current  = text.charAt(i);

            if (symbol.containsKey(current)){
                int count = symbol.get(current);
                symbol.put(current,count+1);

            }else {
                symbol.put(current,1);
            }
        }
        symbol.entrySet().forEach(entry-> System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s"));
    }
}
