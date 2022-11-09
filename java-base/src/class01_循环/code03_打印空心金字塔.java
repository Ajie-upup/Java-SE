package class01_循环;

/**
 * @Author: ajie
 * @Date: 2022/11/9
 * 1、先打印一个矩形
 * 2、打印半个金字塔
 * 3、打印整个金字塔
 * 4、镂空金字塔
 */
public class code03_打印空心金字塔 {
    public static void main(String[] args) {
        int floor = 20;
        for (int i = 1; i <= floor; i++) {
            for (int k = 1; k <= (floor - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == floor) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
