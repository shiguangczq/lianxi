package idea.ui;

import javax.swing.*;

public class TanChuang {

     private TanChuang(){}

    public static void tanChuang(String tanChuang){
        //创建一个弹窗对象
        JDialog jDialog = new JDialog();
        //设置大小
        jDialog.setSize(200,150);
        //让弹窗置顶
        jDialog.setAlwaysOnTop(true);
        //让弹窗居中
        jDialog.setLocationRelativeTo(null);
        //弹窗不关闭无法进行下面操作
        jDialog.setModal(true);
        //创建一个管理文字的对象
        JLabel jLabel = new JLabel(tanChuang);
        //设置大小
        jLabel.setBounds(0,0,200,150);
        //添加到弹窗中
        jDialog.getContentPane().add(jLabel);
        //让弹窗显示出来
        jDialog.setVisible(true);

    }

}
