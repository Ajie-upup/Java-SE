package class04_面向对象.零钱通;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: ajie
 * @Date: 2022/11/24
 * 2)完成零钱通明细.
 * 3)完成收益入账
 * 4)消费
 * 5)退出
 */
public class Menu {
    //先完成显示菜单，并可以选择
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("-------------零钱通菜单--------------");
        System.out.println("            1.零钱通明细             ");
        System.out.println("            2.收益  入账             ");
        System.out.println("            3.消     费             ");
        System.out.println("            4.退     出             ");
        int option;
        Count count = new Count(new ArrayList<Bill>(), 0.00);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入（1 - 4）：");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    getBill(count);
                    break;
                case 2:
                    billAdd(count);
                    break;
                case 3:
                    billDelete(count);
                    break;
                case 4:
                    flag = false;
                    System.out.println("您已经成功退出");
                    break;
                default:
                    System.out.println("不在服务范围内，请重新输入：");
                    break;
            }
        }


    }

    public static void getBill(Count count) {
        List<Bill> bills = count.getBills();
        if (bills == null || bills.size() == 0) {
            System.out.println("您还没有收益入账和消费，请先入账或消费");
            return;
        }
        System.out.println("-------------零钱通明细--------------");
        for (Bill bill : bills) {
            System.out.println(bill.toString());
        }
    }

    public static void billAdd(Count count) {
        System.out.println("------ 您选择的是收益入账 -------");
        System.out.println("请输入你需要添加的金额：");
        List<Bill> bills = count.getBills();
        double totalMoney = count.getTotalMoney();
        double moneyAdd = sc.nextDouble();
        totalMoney += moneyAdd;
        Bill bill = new Bill("收益入账", +moneyAdd, new Date(), totalMoney);
        bills.add(bill);
        count.setTotalMoney(totalMoney);
    }

    public static void billDelete(Count count) {
        System.out.println("------ 您选择的是消费 -------");
        System.out.println("请输入你需要消费的金额：");
        double totalMoney = count.getTotalMoney();
        double moneyDelete = sc.nextDouble();
        totalMoney -= moneyDelete;
        if (totalMoney >= 0) {
            Bill bill = new Bill("消  费", +(-moneyDelete), new Date(), totalMoney);
            count.getBills().add(bill);
            count.setTotalMoney(totalMoney);
        } else {
            System.out.println("您的余额不足，不能消费，请查看余额");
        }
    }

}
