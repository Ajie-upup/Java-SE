package class07_常用类.type01_Wrapper;

/**
 * Integer 常见面试题
 *
 * @Author: ajie
 * @Date: 2022/12/30
 */
public class Code04_WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);    //False
        //所以，这里主要是看范围 - 128 ~ 127  就是直接返回
        /*
        1.  如果 i 在 IntegerCache.low(- 128)~IntegerCache.high(127),就直接从数组返回
        2.  如果不在 - 128~ 127,就直接 new Integer(i)
        public static Integer valueOf(int i) {
            if (i >= IntegerCache.low && i <= IntegerCache.high)
                return IntegerCache.cache[i + (-IntegerCache.low)];
            return new Integer(i);
        }
        */
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); //True
        //所以，这里主要是看范围 - 128 ~ 127  就是直接返回
        // ，否则，就 new Integer(xx);
        Integer x = 128;//底层 Integer.valueOf(1);
        Integer y = 128;//底层 Integer.valueOf(1);
        System.out.println(x == y);//False
    }
}
