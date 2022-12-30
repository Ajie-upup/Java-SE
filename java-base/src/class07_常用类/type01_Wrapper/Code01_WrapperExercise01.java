package class07_常用类.type01_Wrapper;

/**
 * @Author: ajie
 * @Date: 2022/12/30
 */
public class Code01_WrapperExercise01 {
    public static void main(String[] args) {
        Object obj = true ? new Integer(1) : new Double(2.0);
        //输出结果为 1.0
        //三元运算符是一个整体，运算过程中会提升精度
        System.out.println(obj);
    }
}
