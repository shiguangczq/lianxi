package idea.czq.lianxi.main;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DengRuJieMia {

    static ArrayList<YonHuDuiXiang> list = new ArrayList<>();
    static {
        list.add(new YonHuDuiXiang("123a", "123", "123456789123456789", "12345678912"));
    }

    public static void main(String[] args) {
        //        ArrayList<YonHuDuiXiang> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        arr:
        do {
            caiDan();
            String str = sc.next();
            switch (str) {
                case "1" :
                    dengRu(list);
                case "2"
                    :zhuCe(list);
                case "3" : WangJiMiMa(list);
                case "4" : {
                    System.out.println("欢迎下次使用！");
                    break arr;
                }
                default : System.out.println("超出范围范围！");
            }
        } while (true);
    }

    public static void caiDan() {
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请输入你的选择：1.登入 2.注册 3.忘记密码 4.退出");
    }


    public static ArrayList<YonHuDuiXiang> WangJiMiMa(ArrayList<YonHuDuiXiang> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------欢迎进入忘记密码界面！-----------------------");
        System.out.println("\n\n\n\n");
        String next2;
        if (list.size() == 0) {
            System.out.println("用户名未注册，请先注册！");
            return list;
        }
        System.out.println("请输入用户名");
        String next1 = sc.next();
        if (zhanHao(list, next1)) {
            System.out.println("用户存在！");
        } else {
            System.out.println("用户不存在，请先注册用户！");
            return list;
        }
        System.out.println("请输入身份证号码");
        String next20 = sc.next();
        System.out.println("请输入手机号码");
        String next3 = sc.next();
        if (ShenFenzgeng(list, next20) && ShoJi(list, next3)) {
            System.out.println("验证正确！");
        } else {
            System.out.println("账号信息不匹配，修改失败！");
            return list;
        }
        do {
            do {
                System.out.println("请输入密码");
                next1 = sc.next();
                if (pdff3(next1)) {
                    System.out.println("输入正确!");
                    break;
                }
                System.out.println("密码不符合要求，请重新输入！");
            } while (true);
            System.out.println("请再次输入密码");
            next2 = sc.next();
            if (next1.equals(next2)) {
                System.out.println("输入正确!");
                break;
            }
            System.out.println("前后输入的密码不一致，请重新输入！");
        } while (true);
        for (YonHuDuiXiang yonHuDuiXiang : list) {
            if (next20.equals(yonHuDuiXiang.getSfzhm())) {
                yonHuDuiXiang.setMm(next2);
            }
        }
        System.out.println("-----------------------------修改成功！-----------------------------");
        return list;
    }

    public static ArrayList<YonHuDuiXiang> dengRu(ArrayList<YonHuDuiXiang> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------欢迎进入登入界面！-----------------------");
        System.out.println("\n\n\n\n");
        int n1 = 3;
        if (list.size() == 0) {
            System.out.println("用户名未注册，请先注册！");
            return list;
        }
        do {
            System.out.println("请输入用户名");
            String next1 = sc.next();
            System.out.println("请输入密码");
            String next2 = sc.next();
            do {
                System.out.println("请输入验证码");
                String str = suiJiShu();
                System.out.println(str);
                String next = sc.next();
                if (next.equalsIgnoreCase(str)) {
                    System.out.println("验证码输入正确！");
                    break;
                }
                System.out.println("验证码输入错误，请重新输入！");
            } while (true);
            if (zhanHao(list, next1) && mema(list, next2)) {
                break;
            }
            System.out.println("用户名或密码输入错误，请重新输入！");
            n1--;
            System.out.println("你还有" + n1 + "次机会！");
            if (n1 == 0) {
                System.out.println("输入错误过多,退出登入界面。");
                System.out.println("\n\n\n\n");
                return list;
            }
        } while (true);
        System.out.println("-----------------------------登入成功！-----------------------------");
        new XueShengGuanLiXiTon();
        XueShengGuanLiXiTon.main();
        return list;
    }


    public static boolean ShenFenzgeng(ArrayList<YonHuDuiXiang> list, String next20) {
        for (YonHuDuiXiang yonHuDuiXiang : list) {
            if (next20.equals(yonHuDuiXiang.getSfzhm())) {
                return true;
            }
        }
        return false;
    }

    public static boolean ShoJi(ArrayList<YonHuDuiXiang> list, String next3) {
        for (YonHuDuiXiang yonHuDuiXiang : list) {
            if (next3.equals(yonHuDuiXiang.getSjhm())) {
                return true;
            }
        }
        return false;
    }

    public static boolean zhanHao(ArrayList<YonHuDuiXiang> list, String next1) {
        for (YonHuDuiXiang yonHuDuiXiang : list) {
            if (next1.equals(yonHuDuiXiang.getName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean mema(ArrayList<YonHuDuiXiang> list, String next2) {
        for (YonHuDuiXiang yonHuDuiXiang : list) {
            if (next2.equals(yonHuDuiXiang.getMm())) {
                return true;
            }
        }
        return false;
    }

    public static String suiJiShu() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        int a, b;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            b = r.nextInt(10);
            if (i == 4) {
                str.append(b);
                char[] c = str.toString().toCharArray();
                for (int i1 = 0; i1 < c.length; i1++) {
                    int n = r.nextInt(5);
                    char c1 = c[i1];
                    c[i1] = c[n];
                    c[n] = c1;
                }
                for (char value : c) {
                    sb.append(value);
                }
                str = new StringBuilder(sb.toString());
            } else if (b / 2 != 0) {
                a = r.nextInt(26) + 97;
                char c = (char) a;
                str.append(c);
            } else if (b / 2 == 0) {
                a = r.nextInt(26) + 65;
                char c = (char) a;
                str.append(c);
            }
        }
        return str.toString();
    }

    public static boolean pdff(ArrayList<YonHuDuiXiang> list, String next) {
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < next.length(); i++) {
            if (next.charAt(i) >= 'a' && next.charAt(i) <= 'z' || next.charAt(i) >= 'A' && next.charAt(i) <= 'Z') {
                x++;
            } else if (next.charAt(i) >= '0' && next.charAt(i) <= '9') {
                y++;
            } else {
                z++;
            }
        }
        if (next.length() >= 3 && next.length() <= 15 && x >= 1 && y >= 1 && z == 0) {
            for (YonHuDuiXiang yonHuDuiXiang : list) {
                if (next.equals(yonHuDuiXiang.getName())) {
                    System.out.println("当前用户名已存在！");
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean pdff1(String next3) {
        int y = 0;
        for (int i = 0; i < next3.length(); i++) {
            if (next3.charAt(i) >= '0' && next3.charAt(i) <= '9') {
                y++;
            }
        }
        if (next3.length() == 18 && y == 17 && next3.charAt(0) != '0') {
            return next3.charAt(next3.length() - 1) == 'x' || next3.charAt(next3.length() - 1) == 'X';
        } else return y == 18 && next3.charAt(0) != '0';
    }

    public static boolean pdff2(String next4) {
        int y = 0;
        for (int i = 0; i < next4.length(); i++) {
            if (next4.charAt(i) >= '0' && next4.charAt(i) <= '9') {
                y++;
            }
        }
        return next4.length() == 11 && y == 11 && next4.charAt(0) != '0';
    }

    public static boolean pdff3(String next1) {
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < next1.length(); i++) {
            if (next1.charAt(i) >= 'a' && next1.charAt(i) <= 'z' || next1.charAt(i) >= 'A' && next1.charAt(i) <= 'Z') {
                x++;
            } else if (next1.charAt(i) >= '0' && next1.charAt(i) <= '9') {
                y++;
            } else {
                z++;
            }
        }
        if (z != 0) {
            return false;
        }
        if (next1.length() <= 6 && y == next1.length() || next1.length() <= 6 && y == 0) {
            System.out.println("当前密码安全性较低！");
        } else if (next1.length() <= 12 && y == next1.length() || next1.length() <= 12 && y == 0 || next1.length() <= 6 && y < next1.length() || next1.length() <= 6) {
            System.out.println("当前密码安全性中等！");
        } else if (next1.length() > 12 && y == next1.length() || next1.length() >= 12 && y == 0 || next1.length() <= 12 && y < next1.length() || next1.length() <= 12) {
            System.out.println("当前密码安全性较高！");
        } else {
            System.out.println("当前密码安全性非常高！");
        }
        return true;
    }

    public static ArrayList<YonHuDuiXiang> zhuCe(ArrayList<YonHuDuiXiang> list) {
        Scanner sc = new Scanner(System.in);
        YonHuDuiXiang yhdx = new YonHuDuiXiang();
        String next, next1, next3, next4;
        System.out.println("-----------------------欢迎进入注册界面！-----------------------");
        System.out.println("\n\n\n\n");
        do {
            System.out.println("请输入用户名");
            next = sc.next();
            if (pdff(list, next)) {
                System.out.println("注册用户名成功！");
                break;
            }
            System.out.println("注册用户名失败，请重新注册！");
            System.out.println("用户名注册只能使用字母和数字组合，且字母和数字各至少要一位,长度为3~15位。");
        } while (true);
        do {
            do {
                System.out.println("请输入密码");
                next1 = sc.next();
                if (pdff3(next1)) {
                    System.out.println("输入正确!");
                    break;
                }
                System.out.println("密码不符合要求，请重新输入！");
            } while (true);
            System.out.println("请再次输入密码");
            String next2 = sc.next();
            if (next1.equals(next2)) {
                System.out.println("输入正确!");
                break;
            }
            System.out.println("前后输入的密码不一致，请重新输入！");
        } while (true);
        do {
            System.out.println("请输入身份证号码");
            next3 = sc.next();
            if (pdff1(next3)) {
                System.out.println("输入正确！");
                break;
            }
            System.out.println("身份证输入错误，请重新输入！");
        } while (true);
        do {
            System.out.println("请输入手机号码");
            next4 = sc.next();
            if (pdff2(next4)) {
                System.out.println("输入正确！");
                break;
            }
            System.out.println("手机号码输入错误，请重新输入！");
        } while (true);
        yhdx.setName(next);
        yhdx.setMm(next1);
        yhdx.setSfzhm(next3);
        yhdx.setSjhm(next4);
        list.add(yhdx);
        System.out.println("-----------------------------注册成功！-----------------------------");
        return list;
    }
}
