package class04_面向对象.方法递归;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 * 1,1,2,3,5,8,13.....
 */
public class code02_斐波那契数列 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        //要求输入的n >= 1
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
