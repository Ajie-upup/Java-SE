package class04_面向对象.重写equals;

/**
 * @Author: ajie
 * @Date: 2022/11/23
 */
public class EqualsExercise {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 18, '男');
        Person p2 = new Person("jack", 18, '男');
        System.out.println(p1.equals(p2));
    }
}
