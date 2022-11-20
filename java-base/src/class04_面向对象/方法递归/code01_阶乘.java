package class04_面向对象.方法递归;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 */
public class code01_阶乘 {
    public static void main(String[] args) {
        int x = 5;
        int res = factorial(x);
        System.out.println(res);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
