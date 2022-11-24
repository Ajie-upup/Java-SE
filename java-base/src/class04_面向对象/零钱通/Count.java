package class04_面向对象.零钱通;

import java.util.List;

/**
 * @Author: ajie
 * @Date: 2022/11/24
 */
public class Count {
    private List<Bill> bills;
    private double totalMoney;

    public Count() {
    }

    public Count(List<Bill> bills, double totalMoney) {
        this.bills = bills;
        this.totalMoney = totalMoney;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
