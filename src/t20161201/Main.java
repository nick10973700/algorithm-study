package t20161201;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            integers.add(input.nextInt());
        }
        Collections.sort(integers);

        int total = 0;
        int mid = -1;
        if (count == 1) {
            mid = integers.get(0);
            System.out.println(mid);
            return;
        }


        if (count % 2 == 0) {

            if (integers.get((count / 2) - 1) == integers.get(count / 2)) {
                mid = integers.get(count / 2);

                for (int n : integers) {
                    if (n == mid) {
                        total++;
                    }
                }
                if (total % 2 == 0) {
                    System.out.println(mid);
                } else {
                    System.out.println(-1);
                }
            } else {
                System.out.println(mid);
                return;
            }
        } else {
            mid = integers.get(count/2);
            for (int n : integers) {
                if (n == mid) {
                    total++;
                }
            }
            if (total % 2 != 0) {
                System.out.println(mid);
            } else {
                System.out.println(-1);
            }
        }



    }
}
