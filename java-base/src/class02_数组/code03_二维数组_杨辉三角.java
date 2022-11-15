package class02_数组;

/**
 * @Author: ajie
 * @Date: 2022/11/15
 * @Description: 1、第一行有 1 个元素，第n行有 n 个元素
 * 2、每一行的第一个和最后一个元素都为 1
 * 3、从第三行开始，对于非第一个元素和最后一个元素的值都有
 * a[i][j] = a[i-1][j] + a[i-1][j-1]
 */
public class code03_二维数组_杨辉三角 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            //给一维数组开辟空间
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
