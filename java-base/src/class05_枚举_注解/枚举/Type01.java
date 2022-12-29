package class05_枚举_注解.枚举;

/**
 * 自定义类实现枚举
 *
 * @Author: ajie
 * @Date: 2022/12/28
 */
public class Type01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}

//演示字定义枚举实现
class Season {//类
    private String name;
    private String desc;//描述

    //定义了四个对象,  固定值.
    //4.优化，可以加入 final 修饰符
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season WINTER = new Season("冬天", "寒冷");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season SUMMER = new Season("夏天", "炎热");

    //1.将构造器私有化, 目的防止 直接 new
    //2.去掉 setXxx 方法,  防止属性被修改
    //3.在 Season 内部，直接创建固定的对象
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}