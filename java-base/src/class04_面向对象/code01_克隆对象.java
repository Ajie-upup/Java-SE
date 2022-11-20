package class04_面向对象;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 */
public class code01_克隆对象 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "jack";
        p1.age = 18;
        Person p2 = copyPerson(p1);
        //完成克隆对象
        System.out.println(p2.name + " " + p2.age);
        //通过比较对象的hashcode比较
        System.out.println(p1.hashCode() + " " + p2.hashCode());
    }

    public static Person copyPerson(Person p1) {
        Person p2 = new Person();
        p2.name = p1.name;
        p2.age = p1.age;
        return p2;
    }

    static class Person {
        String name;
        int age;
    }

}
