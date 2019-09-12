package t2019_03_02;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int length = 7;
        List<String> strList = new ArrayList<String>();
        String temp;
        for (int i = 0; i < count; i++) {
            temp = input.next();
            for (int j = 0; j < length; j++) {
                //将输入的字符串一个一个存到集合中
                strList.add(temp.substring(j,j+1));
            }

            //循环计算 当集合最终剩一个字符的时候停止计算
            //先计算 x和/
            for (int k = 0; k < strList.size(); k++) {
                if (strList.get(k).equals("x")) {
                    //将运算结果放置在第一位数字上，删除后一位的运算符和第二位数字
                    replace(strList,"x");
                    //集合大小发生变动，坐标回归上一位数字，防止漏算
                    k -= 1;
                } else if (strList.get(k).equals("/")) {
                    replace(strList,"/");
                    k -= 1;
                }

            }
            //算完x和/后 计算+和-
            for (int k = 0; k < strList.size(); k++) {
                if (strList.get(k).equals("+")) {
                    replace(strList,"+");
                    k -= 1;
                } else if (strList.get(k).equals("-")) {
                    replace(strList,"-");
                    k -= 1;
                }
            }

            if (Integer.parseInt(strList.get(0)) == 24) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            strList.clear();
        }
        input.close();
    }

    public static void replace(List<String> strList,String operator) {
        int index = strList.indexOf(operator);
        int n1 = Integer.parseInt(strList.get(index - 1));
        int n2 = Integer.parseInt(strList.get(index + 1));
        if (operator.equals("x")) {
            strList.set(index - 1, (n1 * n2) + "");
        } else if (operator.equals("/")) {
            strList.set(index - 1, (n1 / n2) + "");
        } else if (operator.equals("+")) {
            strList.set(index - 1, (n1 + n2) + "");
        } else if (operator.equals("-")) {
            strList.set(index - 1, (n1 - n2) + "");
        }
        strList.remove(index);
        strList.remove(index);
    }
}
