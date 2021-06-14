package 第六周作业.Chapter12;

/**
 * @author Wang
 * @version 0.0
 */
public class Homework02 {
    public static void main(String[] args) {
        String name = "wang";
        String pwd = "123411";
        String email = "w@qq.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("邮箱注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name, String pwd, String email) {
        int lenth = name.length();
        if (!(2 <= lenth && lenth <= 4)) {
            throw new RuntimeException("名字长度为2-4");
        }

        if (!(pwd.length() == 6 && isDegatial(pwd))) {
            throw new RuntimeException("密码长度应该为6，并且全部是数字");
        }
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和.并且顺序要对");
        }


    }

    public static boolean isDegatial(String pwd) {
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
