package class01_循环;

import java.util.Scanner;

/**
 * @Author: ajie
 * @Date: 2022/11/9
 */
public class code04_打印空心菱形 {
    public static void main(String[] args) {
        int floor;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入层数：");
            floor = sc.nextInt();
            if (floor % 2 == 0) {
                System.out.println("输入参数非法，请从新输入：");
            } else {
                break;
            }
        }
        int mid = floor / 2 + 1;
        for (int i = 1; i <= mid; i++) {
            printDiamond(i, mid);
        }

        for (int i = floor - mid; i > 0; i--) {
            printDiamond(i, mid);
        }
    }

    public static void printDiamond(int i, int mid) {
        for (int k = 1; k <= mid - i; k++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
            if (j == 1 || j == 2 * i - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
