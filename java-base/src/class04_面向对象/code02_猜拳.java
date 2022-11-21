package class04_面向对象;

import java.util.Scanner;

/**
 * @Author: ajie
 * @Date: 2022/11/21
 * 0 - 石头  1 - 剪刀  2  -  布
 */
public class code02_猜拳 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countWin = 0;
        int countLoss = 0;
        int count = 0;
        while (true) {
            //模拟电脑猜拳
            int goal = (int) (Math.random() * 3);
            int target = sc.nextInt();
            if (target == 0) {
                if (goal == 1) {
                    countWin++;
                    System.out.println("第" + (count + 1) + "回合,小明赢了");
                } else if (goal == 2) {
                    countLoss++;
                    System.out.println("第" + (count + 1) + "回合,小明输了");
                } else {
                    System.out.println("第" + (count + 1) + "回合为平局");
                }
            } else if (target == 1) {
                if (goal == 2) {
                    countWin++;
                    System.out.println("第" + (count + 1) + "回合,小明赢了");
                } else if (goal == 0) {
                    countLoss++;
                    System.out.println("第" + (count + 1) + "回合,小明输了");
                } else {
                    System.out.println("第" + (count + 1) + "回合为平局");
                }
            } else if (target == 2) {
                if (goal == 0) {
                    countWin++;
                    System.out.println("第" + (count + 1) + "回合,小明赢了");
                } else if (goal == 1) {
                    countLoss++;
                    System.out.println("第" + (count + 1) + "回合,小明输了");
                } else {
                    System.out.println("第" + (count + 1) + "回合为平局");
                }
            } else if (target == 3) {
                break;
            }
            count++;
        }
        System.out.println("小明猜拳" + count + "次,win：" + countWin + ",loss：" + countLoss);
    }
}
