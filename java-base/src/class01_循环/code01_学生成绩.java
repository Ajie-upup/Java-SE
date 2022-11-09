package class01_循环;

import java.util.Scanner;

/**
 * @Author: ajie
 * @Date: 2022/11/9
 * 统计三个班成绩情况，求出各个班级的平均分和所有班级的平均分
 * 测试数据：
 * 甲
 * 乙
 * 丙
 */
public class code01_学生成绩 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 3; i++) {
            int[] score = new int[5];
            double sum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第" + i + "个班级第" + j + "个学生的成绩");
                score[j - 1] = sc.nextInt();
                sum += score[j - 1];
            }
            total += sum;
            System.out.println("班级" + i + "的总分为" + sum + "的平均分为" + (sum / 5));
        }
        System.out.println("三个班的总成绩为" + total + " 平均分为" + (total / 15));
    }
}
