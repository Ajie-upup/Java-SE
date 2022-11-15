package class02_数组;

/**
 * @Author: ajie
 * @Date: 2022/11/13
 */
public class code01_数组的创建 {
    public static void main(String[] args) {
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A' + i);
        }
        for (char one : chars) {
            System.out.print(one + " ");
        }
    }
}
