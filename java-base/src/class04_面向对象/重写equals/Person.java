package class04_面向对象.重写equals;

/**
 * @Author: ajie
 * @Date: 2022/11/23
 */
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        //判断比较的类型是否为同一个对象
        if (this == obj) {
            return true;
        }
        //类型判断
        if (obj instanceof Person) {
            Person personObj = (Person) obj;
            return this.name.equals(personObj.name) && this.age == personObj.age && this.gender == personObj.gender;
        }
        return false;
    }
}
