package class04_面向对象.方法递归;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 */
public class code05_汉洛塔问题 {
    public static void main(String[] args) {
        move(5,'A','B','C');
    }

    public static void move(int num, char a, char b, char c) {
        //如果只有一个盘，num = 1
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //如果有多个盘，将多个盘看成两个盘，（最下面的盘和num-1个盘）
            //1、先移动上面所有的盘到b盘，借助c
            move(num - 1, a, c, b);
            //2、把最下面的这个盘，移动到c盘
            System.out.println(a + "->" + c);
            //将b塔所有的盘，移动到c，借助a
            move(num - 1, b, a, c);
        }
    }

}
