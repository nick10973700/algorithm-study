package t20171202;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int k = input.nextInt();

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < count + 1; i++) {
            integerList.add(i);
        }

        int n = 0;
        int temp = 0;
        if (k == 1) {
            System.out.println(integerList.get(count-1));
            return;
        }
        while (integerList.size() != 1) {
            for (Iterator<Integer> it = integerList.iterator(); it.hasNext();) {
                it.next();
                temp = ++n;
                if (temp % k == 0 || temp % 10 == k) {
                    it.remove();
                }
            }
        }
        System.out.println(integerList.get(0));
    }
}
