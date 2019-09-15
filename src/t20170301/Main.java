package t20170301;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int k = input.nextInt();

        ArrayList<Integer> weights = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            weights.add(input.nextInt());
        }

        int totalWeight = 0;
        int person = 0;
        while (weights.size() != 0) {
            totalWeight = 0;
            for (Iterator<Integer> it = weights.iterator(); it.hasNext();) {
                totalWeight = totalWeight + it.next();
                it.remove();
                if (totalWeight >= k || !it.hasNext()) {
                    person = person + 1;
                    break;
                }
            }
        }
        System.out.println(person);
    }
}
