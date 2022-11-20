package class04_面向对象.方法递归;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 */
public class code04_迷宫问题 {
    public static void main(String[] args) {
        //1、二位数组创建迷宫
        int[][] map = new int[8][7];
        //2、创建障碍物
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
//        printMi(map);
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
//        printMi(map);
        map[3][1] = 1;
        map[3][2] = 1;
//        printMi(map);
        //确定小球的起始位置
        findWay(map, 1, 1);
        printMi(map);

        //回溯
//        map[2][2] = 1;
    }

    public static boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                //制定小球运动路线
                if (findWay(map, i + 1, j)) { //下
                    return true;
                } else if (findWay(map, i, j + 1)) { //右
                    return true;
                } else if (findWay(map, i - 1, j)) { //上
                    return true;
                } else if (findWay(map, i, j - 1)) { //左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else { // map[i][j] = 1  2  3
                return false;
            }
        }
    }


    public static void printMi(int[][] map) {
        //输出当前迷宫状况
        System.out.println("=======输出当前迷宫状况========");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
