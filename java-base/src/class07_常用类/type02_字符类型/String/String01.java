package class07_常用类.type02_字符类型.String;

/**
 * @Author: ajie
 * @Date: 2022/12/30
 */
public class String01 {
    String str = new String("ajie");
    final char[] ch = {'a', 'j'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        String01 s = new String01();
        s.change(s.str, s.ch);
        System.out.println(s.str);
        System.out.println(s.ch);
    }
}
