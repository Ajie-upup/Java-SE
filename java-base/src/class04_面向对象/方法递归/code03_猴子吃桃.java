package class04_面向对象.方法递归;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 * 猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
 * 以后每天猴子都吃其中的一半，然后再多吃一个。当到第 10 天时，
 * 想再吃时 (即还没吃) ，发现只有 1 个桃子了。问题：最初共多少个桃子？
 */
public class code03_猴子吃桃 {
    public static void main(String[] args) {
        //思路分析 逆推
        //1. day = 10  时 有 1 个桃子
        //2. day = 9  时  有 (day10 + 1) * 2 = 4
        //3. day = 8  时  有 (day9 + 1) * 2 = 10
        //4. 规律就是  前一天的桃子 = (后一天的桃子 + 1) *2
        //5. 递归

    }

    public static int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            return -1;
        }
    }
}
