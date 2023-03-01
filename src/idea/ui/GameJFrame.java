package idea.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {            //继承窗口

    int[][] data = new int[4][4];
    //记入二维数组的位置
    int x = 0;
    int y = 0;

    //定义一个变量,记录图片路径
    String path = "image\\animal\\animal3\\";

    //定义一个正确的二维数组，存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    int stpe = 0;

    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reloginItem = new JMenuItem("重新登入");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenu gengHuanTuPian = new JMenu("更换图片");

    JMenuItem meiNu = new JMenuItem("美女");
    JMenuItem dongWu = new JMenuItem("动物");
    JMenuItem yunDong = new JMenuItem("运动");
    JMenuItem accountItem = new JMenuItem("公众号");


    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        intiJMenuBar();


        //初始化数据（打乱）
        initData();
        //初始化图片
        initImage();
        //让界面显示出来
        this.setVisible(true);
    }


    //打乱图片
    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    private void initImage() {
        //清空原本已经出现的图片
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利
            JLabel winJLabel = new JLabel(new ImageIcon("image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }


        JLabel stpeCount = new JLabel("步数：" + stpe);
        stpeCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stpeCount);

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                //创建一个图片ImageIcon对象
                ImageIcon icon1 = new ImageIcon(path + num + ".jpg");
                //创建一个JLabl1的对象（管理容器）
                JLabel jLabel1 = new JLabel(icon1);
                //指定图片位置
                jLabel1.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel1.setBorder(new BevelBorder(BevelBorder.RAISED));
                //把管理容器添加到界面中,隐藏容器
                this.getContentPane().add(jLabel1);
            }
        }

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();
    }


    private void intiJMenuBar() {
        //初始化菜单
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");


        //将美女等添加到更换图片中
        gengHuanTuPian.add(meiNu);
        gengHuanTuPian.add(dongWu);
        gengHuanTuPian.add(yunDong);


        //将每一个选项下面的条目添加到选项
        functionJMenu.add(gengHuanTuPian);
        functionJMenu.add(reloginItem);
        functionJMenu.add(replayItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);


        //给条目绑定事件
        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        meiNu.addActionListener(this);
        dongWu.addActionListener(this);
        yunDong.addActionListener(this);


        //将菜单里面的两个选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的寛高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();
        if (code == 65) {
            //把界面中所以图片删除
            this.getContentPane().removeAll();
            //加载完整的图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //加载背景图片
            JLabel background = new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            //刷新一下界面
            this.getContentPane().repaint();


        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利则结束程序
        if (victory()) {
            return;
        }

        //对上:38，下:40，左:37，右:39进行设置
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;

            //计算步数
            stpe++;
            //调用方法加载最新图片
            initImage();


        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                //无法再移动
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;

            //计算步数
            stpe++;
            //调用方法加载最新图片
            initImage();


        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;

            //计算步数
            stpe++;
            //调用方法加载最新图片
            initImage();


        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;

            //计算步数
            stpe++;
            //调用方法加载最新图片
            initImage();

        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    //判断data数组是否与win数组相同
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            //data[i]表示每一个一维数组
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] != win[i][j]) {
                    //只要有一个不一样就返回false
                    return false;
                }
                data[i][j] = win[i][j];
            }

        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取被点击的对象
        Object obj = e.getSource();
        //判断
        if (obj == replayItem) {
            System.out.println("重新游戏");
            //计步器
            stpe = 0;
            //重新打乱图片
            initData();
            //重新加载图片
            initImage();


        } else if (obj == reloginItem) {
            System.out.println("重新登入");

            //关闭当前界面
            this.setVisible(false);
            //打开登入界面
            new LoginJFrame();

        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);

        } else if (obj == accountItem) {
            System.out.println("公众号");

            //创建一个弹窗对象
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.png"));
            //设置位置和宽高
            jLabel.setBounds(0, 0, 258, 258);
            //把图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);
            //给弹窗设计大小
            jDialog.setSize(344, 344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        } else if (obj == meiNu) {
            System.out.println("更换美女图片");
            int[] meinu = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            Random r = new Random();
            int i = r.nextInt(meinu.length);
            if (i == 1) {
                path = "image\\girl\\girl1\\";
            } else if (i == 2) {
                path = "image\\girl\\girl2\\";
            } else if (i == 3) {
                path = "image\\girl\\girl3\\";
            } else if (i == 4) {
                path = "image\\girl\\girl4\\";
            } else if (i == 5) {
                path = "image\\girl\\girl5\\";
            } else if (i == 6) {
                path = "image\\girl\\girl6\\";
            } else if (i == 7) {
                path = "image\\girl\\girl7\\";
            } else if (i == 8) {
                path = "image\\girl\\girl8\\";

            } else if (i == 9) {
                path = "image\\girl\\girl9\\";
            } else if (i == 10) {
                path = "image\\girl\\girl10\\";
            } else if (i == 11) {
                path = "image\\girl\\girl11\\";
            } else if (i == 12) {
                path = "image\\girl\\girl12\\";
            } else {
                path = "image\\girl\\girl13\\";
            }
            //重新打乱图片
            initData();
            //调用方法加载最新图片
            initImage();


        } else if (obj == dongWu) {
            System.out.println("更换动物图片");
            int[] dongwu = {1, 2, 3, 4, 5, 6, 7, 8};
            Random r = new Random();
            int i = r.nextInt(dongwu.length);
            if (i == 1) {
                path = "image\\animal\\animal1";
            } else if (i == 2) {
                path = "image\\animal\\animal2\\";
            } else if (i == 3) {
                path = "image\\animal\\animal3\\";
            } else if (i == 4) {
                path = ".image\\animal\\animal4\\";
            } else if (i == 5) {
                path = "image\\animal\\animal5\\";
            } else if (i == 6) {
                path = "image\\animal\\animal6\\";
            } else if (i == 7) {
                path = "image\\animal\\animal7\\";
            } else {
                path = "image\\animal\\animal8\\";
            }
            //重新打乱图片
            initData();
            //调用方法加载最新图片
            initImage();


        } else if (obj == yunDong) {
            System.out.println("更换运动图片");
            int[] yundong = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Random r = new Random();
            int i = r.nextInt(yundong.length);
            if (i == 1) {
                path = "image\\sport\\sport1\\";
            } else if (i == 2) {
                path = "image\\sport\\sport2\\";
            } else if (i == 3) {
                path = "image\\sport\\sport3\\";
            } else if (i == 4) {
                path = "image\\sport\\sport4\\";
            } else if (i == 5) {
                path = "image\\sport\\sport5\\";
            } else if (i == 6) {
                path = "image\\sport\\sport6\\";
            } else if (i == 7) {
                path = "image\\sport\\sport7\\";
            } else if (i == 8) {
                path = "image\\sport\\sport8\\";
            } else if (i == 9) {
                path = "image\\sport\\sport9\\";
            } else {
                path = "image\\sport\\sport10\\";
            }
            //重新打乱图片
            initData();
            //调用方法加载最新图片
            initImage();
        }
    }
}
