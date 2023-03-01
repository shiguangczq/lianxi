package textui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class text extends JFrame implements KeyListener {


    public text() {
        this.setSize(1300, 760);
        //设置界面的标题
        this.setTitle("平面格斗");
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

    private void tianJiaZuJi() {
        //添加密码文字
        JLabel jLabel1 = new JLabel(new ImageIcon("C:\\Users\\20653\\Desktop\\OIP-C.png"));
        jLabel1.setBounds(230, 100, 200, 200);

        this.getContentPane().add(jLabel1);
        //添加背景图片
        JLabel bacKground = new JLabel(new ImageIcon("C:\\Users\\20653\\Desktop\\244-15121G03641.jpg"));
        bacKground.setBounds(0, 0, 1280, 720);
        this.getContentPane().add(bacKground);
        //刷新一下界面
        this.getContentPane().repaint();
    }
    private void initImage(){
        //清空原本已经出现的图片
        this.getContentPane().removeAll();

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
