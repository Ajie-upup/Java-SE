package class01_循环;

import java.util.Scanner;

/**
 * @Author: ajie
 * @Date: 2022/11/9
 */
public class code05_登录验证 {
    public static void main(String[] args) {
        int count = 3;
        final String username = "ajie";
        final String password = "123456";
        int chance = count;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("请输入用户名:");
            String name = sc.next();
            System.out.println("请输入密码");
            String check = sc.next();
            if (username.equals(name) && password.equals(check)) {
                System.out.println("登陆成功");
                break;
            }
            if (--chance > 0) {
                System.out.println("用户名或密码不正确，您还有" + chance + "次机会");
            } else {
                System.out.println("您的次数已经耗尽，请稍后再试，忘记密码请联系管理员");
            }

        }
    }
}
