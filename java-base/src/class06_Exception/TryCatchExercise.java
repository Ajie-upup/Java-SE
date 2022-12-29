package class06_Exception;

import java.util.Scanner;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String inputStr = "";
        while (true) {
            System.out.println("请输入一个整数：");
            inputStr = sc.next();
            try {
                num = Integer.parseInt(inputStr);
                break;
            } catch (Exception e) {
                System.out.println("您输入的不是一个整数，请重新输入！");
            }
        }
        System.out.println("num = " + num);
    }
}
