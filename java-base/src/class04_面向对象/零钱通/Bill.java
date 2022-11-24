package class04_面向对象.零钱通;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: ajie
 * @Date: 2022/11/24
 */
public class Bill {
    private String operation;
    private double change;
    private Date date;
    private double money;

    public Bill() {
    }

    public Bill(String operation, double change, Date date, double money) {
        this.operation = operation;
        this.change = change;
        this.date = date;
        this.money = money;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        return operation + '\t'  +
                (change > 0 ? "+" + change : change) + '\t' +
                dateFormat.format(date) + '\t' +
                money;
    }
}
