package idea.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class RegisterJFrame extends JFrame implements MouseListener {           //继承窗口

    //添加用户名输入框对象
    JTextField jTextField = new JTextField();
    //添加密码输入框对象
    JTextField jTextField1 = new JTextField();
    //添加再次输入密码输入框对象
    JTextField jTextField2 = new JTextField();
    //添加验证码输入框对象
    JTextField jTextField3 = new JTextField();
    //获取正确的验证码的载体
    String yenZhangMa;
    //验证码点击对象
    JLabel jLabel5 = new JLabel();
    //添加登入按钮对象
    JButton jButton = new JButton();
    public RegisterJFrame(){
        this.setSize(488,500);
        //设置界面的标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);
        //添加组件
        Diem();
        //刷新一下界面
        this.getContentPane().repaint();
        //设置显示界面
        this.setVisible(true);
    }


    private void Diem() {
        //添加用户名文字
        JLabel jLabel = new JLabel(new ImageIcon("image\\login\\用户名.png"));
        jLabel.setBounds(116,135,47,17);
        this.getContentPane().add(jLabel);
        //添加用户名输入框
        jTextField.setBounds(195,135,200,30);
        this.getContentPane().add(jTextField);
        //添加密码文字
        JLabel jLabel1 = new JLabel(new ImageIcon("image\\login\\密码.png"));
        jLabel1.setBounds(130,195,32,16);
        this.getContentPane().add(jLabel1);
        //添加密码输入框
        jTextField1.setBounds(195,195,200,30);
        this.getContentPane().add(jTextField1);
        //添加再次密输入码文字
        JLabel jLabel2 = new JLabel(new ImageIcon("image\\login\\密码.png"));
        jLabel2.setBounds(130,256,50,30);
        this.getContentPane().add(jLabel2);
        //添加再次输入密码输入框
        jTextField2.setBounds(190,256,200,30);
        this.getContentPane().add(jTextField2);
        //添加验证码文字
        JLabel jLabel3 = new JLabel(new ImageIcon("image\\login\\验证码.png"));
        jLabel3.setBounds(133,310,50,30);
        this.getContentPane().add(jLabel3);
        //添加验证码输入框
        jTextField3.setBounds(195,310,100,30);
        this.getContentPane().add(jTextField3);
        //设置验证码
        yenZhangMa = SuiJiShu.shiJiShu(new String[5]);
        //添加验证码内容
        jLabel5.setText(yenZhangMa);
        //设置事件
        jLabel5.addMouseListener(this);
        //设置位置宽高
        jLabel5.setBounds(300,310, 50, 30);
        //添加到界面
        this.getContentPane().add(jLabel5);

        //添加登入按钮
        jButton.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        jButton.setBounds(175,380,128,47);
        //去除按钮的边框
        jButton.setBorderPainted(false);
        //去除按钮的背景
        jButton.setContentAreaFilled(false);
        //设置事件
        jButton.addMouseListener(this);
        this.getContentPane().add(jButton);

        //添加背景
        JLabel jLabel4 = new JLabel(new ImageIcon("image\\background.png"));
        jLabel4.setBounds(0,0,470,540);
        this.getContentPane().add(jLabel4);


        //刷新一下界面
        this.getContentPane().repaint();
    }
    //单击
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==jButton){
            //获取用户名输入框数据
            String text = jTextField.getText();
            //获取密码输入框数据
            String text1 = jTextField1.getText();
            //获取再次输入密码输入框数据
            String text2 = jTextField2.getText();
            //获取验证码输入框数据
            String text3 = jTextField3.getText();
            if(text3.length()==0){
                TanChuang.tanChuang("抱歉！您还没有输入验证码！");
            }else if(text3.equalsIgnoreCase(yenZhangMa)){
                if(text.length()!=0 && text1.length()!=0 && text2.length()!=0){
                    if(text1.equals(text2)){
                        uijavaB uijavaB = new uijavaB(text, text1);
                        LoginJFrame.list.add(uijavaB);
                        //关闭当前登录界面
                        this.setVisible(false);
                        //加载登入界面
                        new LoginJFrame();
                    }else {
                        TanChuang.tanChuang("两次密码不一致请重新输入");
                    }
                }else {
                    TanChuang.tanChuang("你还没有输入用户名或者密码");
                }
            }else {
                TanChuang.tanChuang("验证码输入错误！");
            }
        }else if (e.getSource()==jLabel5){
            //重新设置验证码
            yenZhangMa = SuiJiShu.shiJiShu(new String[5]);
            //添加验证码内容
            jLabel5.setText(yenZhangMa);
        }
    }
    //按下
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource()==jButton){
            //修改标签图片或者文字
            jButton.setIcon(new ImageIcon("image\\login\\登录按下.png"));
        }

    }
    //按下结束
    @Override
    public void mouseReleased(MouseEvent e) {
    if (e.getSource()==jButton){
        jButton.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
    }
    }
    //划入
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    //划出
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
