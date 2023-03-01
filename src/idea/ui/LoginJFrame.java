package idea.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {            //继承窗口

    //定义一个集合
    static ArrayList<uijavaB> list = new ArrayList<>();
    //初始数据
    static {
        uijavaB zhangsan = new uijavaB("zhangsan", "123");
        uijavaB lisi = new uijavaB("lisi", "123");
        list.add(zhangsan);
        list.add(lisi);
    }

    //添加登入按钮
    JButton login = new JButton();
    //添加注册按钮
    JButton register = new JButton();
    //添加用户名输入框
    JTextField jTextField = new JTextField();
    //添加密码输入框(密文)
    JPasswordField jPasswordField = new JPasswordField();
    //添加验证码输入框对象
    JTextField jTextField2 = new JTextField();
    //获取正确的验证码的载体
    String yenZhangMa;
    //记载验证码的载体
    String text;
    //记载用户名的载体
    String text1;
    //记载密码的载体
    String selectedText;
    //更换验证码的载体
    JLabel jLabel3;

    //初始化界面
    public LoginJFrame() {
        this.setSize(488, 430);
        //设置界面的标题
        this.setTitle("拼图 登入");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);
        //添加组件
        tianJiaZuJi();
        //刷新一下界面
        this.getContentPane().repaint();
        //显示界面
        this.setVisible(true);

    }

    //添加各个组件
    private void tianJiaZuJi() {
        //添加用户名文字
        JLabel jLabel = new JLabel(new ImageIcon("image\\login\\用户名.png"));
        jLabel.setBounds(116, 135, 47, 17);
        this.getContentPane().add(jLabel);

        //添加用户名输入框
        jTextField.setBounds(195, 134, 200, 30);
        this.getContentPane().add(jTextField);

        //添加密码文字
        JLabel jLabel1 = new JLabel(new ImageIcon("image\\login\\密码.png"));
        jLabel1.setBounds(130, 195, 32, 16);
        this.getContentPane().add(jLabel1);

        //添加密码输入框(密文)
        jPasswordField.setBounds(195, 195, 200, 30);
        this.getContentPane().add(jPasswordField);

        //添加验证码文字
        JLabel jLabel2 = new JLabel(new ImageIcon("image\\login\\验证码.png"));
        jLabel2.setBounds(133, 256, 50, 30);
        this.getContentPane().add(jLabel2);

        //添加验证码输入框位置
        jTextField2.setBounds(195, 256, 100, 30);
        this.getContentPane().add(jTextField2);

        //设置验证码
        yenZhangMa = SuiJiShu.shiJiShu(new String[5]);
        //添加验证码内容
        jLabel3 = new JLabel();
        jLabel3.setText(yenZhangMa);
        //设置事件
        jLabel3.addMouseListener(this);
        //设置位置宽高
        jLabel3.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(jLabel3);

        //设置登入位置
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        //去除按钮的边框
        login.setBorderPainted(false);
        //去除按钮的背景
        login.setContentAreaFilled(false);
        //设置事件
        login.addMouseListener(this);
        this.getContentPane().add(login);


        //设置注册位置
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("image\\register\\注册按钮.png"));
        //去除按钮的边框
        register.setBorderPainted(false);
        //去除按钮的背景
        register.setContentAreaFilled(false);
        //设置事件
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //添加背景图片
        JLabel bacKground = new JLabel(new ImageIcon("image\\login\\background.png"));
        bacKground.setBounds(0, 0, 470, 390);
        this.getContentPane().add(bacKground);
        //刷新一下界面
        this.getContentPane().repaint();

    }

    //单击
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login) {

            //获取的验证码输入框的内容
            text = jTextField2.getText();
            //获取用户名输入框的内容
            text1 = jTextField.getText();
            //获取密码输入框的内容
            selectedText = jPasswordField.getText();

            //使用户名和密码返回值不为null
            if (text1 == null) {
                text1 = "";
            }else if (selectedText == null) {
                selectedText = "";
            }
            //处理验证码问题
            if (text.length() == 0) {
                TanChuang.tanChuang("抱歉！您还没有输入验证码！");
            } else {
                if (!text.equalsIgnoreCase(yenZhangMa)) {
                    TanChuang.tanChuang("抱歉！验证码输入错误！");
                } else {
                    //处理用户名和密码问题
                    if (pd(text1, selectedText)) {
                        TanChuang.tanChuang("抱歉！您还没有输入用户名或者密码！");
                    } else {
                        if (pd1(list, text1, selectedText)) {
                            //关闭当前登录界面
                            this.setVisible(false);
                            //加载游戏界面
                            new GameJFrame();
                        } else {
                            TanChuang.tanChuang("用户名或者密码输入错误");
                        }
                    }

                }
            }
        }else if (e.getSource()==jLabel3){
            //重新设置验证码
            yenZhangMa = SuiJiShu.shiJiShu(new String[5]);
            //添加验证码内容
            jLabel3.setText(yenZhangMa);
        }else if (e.getSource() == register){
            //关闭当前登录界面
            this.setVisible(false);
            //加载注册界面
            new RegisterJFrame();
        }
    }


    //判断用户名和密码是否存在
    public static boolean pd1(ArrayList<uijavaB> list, String text1, String selectedText) {
        for (int i = 0; i < list.size(); i++) {
            uijavaB uijavaB = new uijavaB();
            uijavaB = list.get(i);
            if (uijavaB.getYonHuMing().equals(text1) && uijavaB.getMiMa().equals(selectedText)) {
                return true;
            }
        }
        return false;
    }


    //    判断用户名和密码是否为空
    public static boolean pd(String text1, String selectedText) {
        if (text1.equals("") || selectedText.equals("")) {
            return true;
        }
        return false;
    }
    //按下
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login) {
            //修改标签图片或者文字
            login.setIcon(new ImageIcon("image\\login\\登录按下.png"));
        }else if (e.getSource() == register){
            register.setIcon(new ImageIcon("image\\register\\注册按下.png"));
        }
    }
    //按下结束
    @Override
    public void mouseReleased(MouseEvent e) {

        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        }else if(e.getSource() == register){
            register.setIcon(new ImageIcon("image\\register\\注册按钮.png"));
        }
    }
    //划入
    @Override
    public void mouseEntered(MouseEvent e) {}
    //划出
    @Override
    public void mouseExited(MouseEvent e) {}
}
