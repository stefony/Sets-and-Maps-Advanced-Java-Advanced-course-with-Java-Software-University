package Sets_And_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_Sets_of_Elements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int first = Integer.parseInt(input.split("\\s+")[0]);
        int second = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <=first ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            firstSet.add(num);
        }

        for (int i = 1 ; i <=second ; i++) {
            int volume = Integer.parseInt(scanner.nextLine());
            secondSet.add(volume);
        }
        Set<Integer> dublicate = new LinkedHashSet<>();
//        for (int num : firstSet) {
//            if (secondSet.contains(num)){
//                dublicate.add(num);
//                System.out.print(num + " ");
        firstSet.retainAll(secondSet);
        firstSet.forEach(el->System.out.print(el + " "));
    }
}
