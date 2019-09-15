package t20150901;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        Stack<Integer> stack = new Stack<>();
        int total = 0;
        int temp = 0;
        for (int i = 0; i < count; i++) {
            temp = input.nextInt();
            if (stack.empty()) {
                stack.push(temp);
                total++;
            }else{
                if (stack.peek() != temp) {
                    stack.push(temp);
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}
