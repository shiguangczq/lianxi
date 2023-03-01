package idea.czq.lianxi.main;

import java.util.Random;
import java.util.Scanner;

public class JiNeng {
    private  String nameN;
    private int lanLiangL;
    private  int lanLiangS;

    public JiNeng(){};
    public JiNeng(String name, int lanLiangl, int lanLiangs){
        this.nameN=name;
        this.lanLiangL=lanLiangl;
        this.lanLiangS=lanLiangs;
    }

    public void setName(String name){
        this.nameN=name;
    }
    public String getName(){
        return nameN;
    }
    public void setLanLiangl(int lanLiangl){
        this.lanLiangL=lanLiangl;
    }
    public int getLanLiangl (){
        return lanLiangL;
    }
    public void setLanLiangs(int lanLiangs){
        this.lanLiangS=lanLiangs;
    }
    public int getLanLiangs (){
        return lanLiangS;
    }

        public static boolean jG(RenWu rw,RenWu rw1,JiNeng jn0,JiNeng jn1,JiNeng jn2,JiNeng jn3,JiNeng jn4,JiNeng jn5,
                                 JiNeng jn6,JiNeng jn7,JiNeng jn8,JiNeng jn9, JiNeng jn10,JiNeng jn11,JiNeng jn12,JiNeng
                                         jn13,JiNeng jn14,int rr) {
            int x = rw.getLanLiang(), y = rw1.getXuiLiang(), x1 = rw1.getLanLiang(), y1 = rw.getXuiLiang();
            boolean xyz = true;
            String qq=null,qqq=null;
            Scanner sc = new Scanner(System.in);
            if(rr == 0){
                qq=jn4.nameN;
                qqq=jn7.nameN;
            }
            if(rr == 1){
                qq=jn5.nameN;
                qqq=jn6.nameN;
            }
            if(rr == 2){
                qq=jn8.nameN;
                qqq=jn9.nameN;
            }
            System.out.println("你的对手是：" + rw1.getName()+"    技能 ："+ qq+qqq);
           for(int i=1;;) {
                 System.out.println();
                 System.out.println("---------------"+"第"+i+"回合"+"---------------");
                 System.out.println();
               System.out.print("你可以使用的技能：");
               System.out.println("0.【普通攻击】(攻击：10~20/耗蓝：0)  " + "  1.【掌心雷】(攻击：20~30/耗蓝：-10)  " + "  *2.【气体源流】(攻击：0/回蓝：+50~60)  " + "  3.【三昧真火】(攻击：80~90/耗蓝：-80)  ");
               System.out.println("*4.【九阳神功】(耗蓝：-50/回血：100~110)  " + "  *5.【北冥神功】(耗血：-50/回蓝：100~110)  " + "  6.【六脉神剑】(攻击：150~160/耗蓝：-100)  " + "  7.【葵花宝典】(攻击：120~130/耗蓝：-90)  "+ "  *8.【九阴真经】(回蓝：80~90/耗血：-40)  ");
               System.out.println("请选择技能");
                 Random rrrrr = new Random();
                 int r = rrrrr.nextInt(11);
                int xz = sc.nextInt();
                if (x < 80) {
                    System.out.println("0.【普通攻击】(10~20/0)  " + "  1.【掌心雷】(20~30/-10)  " + "  2.【气体源流】(0/+50~60)  ");
                    switch (xz) {
                        case 0:
                            System.out.println("你选择了【普通攻击】");
                            System.out.println("你打出一套虾米拳法 " + rw1.getName() + "轻松应对");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn0.lanLiangS-r)+"伤害");
                            x = rw.getLanLiang();
                            y = rw1.getXuiLiang() + jn0.lanLiangS-r;
                            break;
                        case 1:
                            System.out.println("你选择了【掌心雷】");
                            System.out.println("只见一声巨响  " + rw1.getName() + "被电的发黑");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn1.lanLiangS-r)+"伤害");
                            x = rw.getLanLiang() + jn1.lanLiangL;
                            y = rw1.getXuiLiang() + jn1.lanLiangS-r;
                            break;
                        case 2:
                            System.out.println("你选择了【气体源流】");
                            System.out.println("一股能量汇聚在你的体内");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn2.lanLiangS)+"伤害");
                            x = rw.getLanLiang() + jn2.lanLiangL+r;
                            break;
                        default:
                            System.out.println("抱歉,输入错误 请重新输入");
                            continue;
                    }
                    System.out.println("\t\t" + rw.getName() + "\t\t\t\t\t" + rw1.getName());
                    System.out.println("\t\t" + "血量 ："+y1 + "    \t\t" + "血量 ："+y);
                    System.out.println("\t\t" + "蓝量 ："+x + "    \t\t" + "蓝量 ："+x1);
                } else if (x < 10) {
                    System.out.println("0.【普通攻击】(10~20/0)  " + "  2.【气体源流】(0/+50~60)  ");
                    switch (xz) {
                        case 0:
                            System.out.println("你选择了【普通攻击】");
                            System.out.println("你打出一套虾米拳法 " + rw1.getName() + "轻松应对");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn0.lanLiangS-r)+"伤害");
                            x = rw.getLanLiang();
                            y = rw1.getXuiLiang() + jn0.lanLiangS-r;
                            break;
                        case 2:
                            System.out.println("你选择了【气体源流】");
                            System.out.println("一股能量汇聚在你的体内");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn2.lanLiangS)+"伤害");
                            x = rw.getLanLiang() + jn2.lanLiangL+r;
                            break;
                        default:
                            System.out.println("抱歉,输入错误 请重新输入");
                            continue;
                    }
                    System.out.println("\t\t" + rw.getName() + "\t\t\t\t\t" +rw1.getName());
                    System.out.println("\t\t" + "血量 ："+y1 + "    \t\t" + "血量 ："+y);
                    System.out.println("\t\t" + "蓝量 ："+x + "    \t\t" + "蓝量 ："+x1);
                } else {
                    System.out.println("0.【普通攻击】(攻击：10~20/耗蓝：0)  " + "  1.【掌心雷】(攻击：20~30/耗蓝：-10)  " + "  *2.【气体源流】(攻击：0/回蓝：+50~60)  " + "  3.【三昧真火】(攻击：80~90/耗蓝：-80)  ");
                    System.out.println("*4.【九阳神功】(耗蓝：-50/回血：100~110)  " + "  *5.【北冥神功】(耗血：-50/回蓝：100~110)  " + "  6.【六脉神剑】(攻击：150~160/耗蓝：-100)  " + "  7.【葵花宝典】(攻击：120~130/耗蓝：-90)  "+ "  *8.【九阴真经】(回蓝：80~90/耗血：-40)  ");
                    switch (xz) {
                        case 0:
                            System.out.println("你选择了【普通攻击】");
                            System.out.println("你打出一套虾米拳法 " + rw1.getName() + "轻松应对");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn0.lanLiangS-r)+"伤害");
                            x = rw.getLanLiang();
                            y = rw1.getXuiLiang() + jn0.lanLiangS-r;
                            break;
                        case 1:
                            System.out.println("你选择了【掌心雷】");
                            System.out.println("只见一声巨响  " + rw1.getName() + "被电的发黑");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn1.lanLiangS-r)+"伤害");
                            x = rw.getLanLiang() + jn1.lanLiangL;
                            y = rw1.getXuiLiang() + jn1.lanLiangS-r;
                            break;
                        case 2:
                            System.out.println("你选择了【气体源流】");
                            System.out.println("一股能量汇聚在你的体内");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn2.lanLiangS)+"伤害");
                            x = rw.getLanLiang() + jn2.lanLiangL+r;
                            break;
                        case 3:
                            System.out.println("你选择了【三昧真火】");
                            System.out.println("突然一团火焰冒出  " + rw1.getName() + "被烧成黑碳");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn3.lanLiangS-r)+"伤害");
                            x = rw.getLanLiang() + jn3.lanLiangL;
                            y = rw1.getXuiLiang() + jn3.lanLiangS-r;
                            break;
                        case 4:
                            System.out.println("你选择了【九阳神功】");
                            System.out.println("你打出一套九阳神功 " + rw1.getName() + "轻松应对");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn2.lanLiangS)+"伤害");
                            y1 = rw.getXuiLiang() + jn10.lanLiangS+r;
                            x = rw.getLanLiang() + jn10.lanLiangL;
                            break;
                        case 5:
                            System.out.println("你选择了【北冥神功】");
                            System.out.println("你打出一套北冥神功 " + rw1.getName() + "轻松应对");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn2.lanLiangS)+"伤害");
                            y1 = rw.getXuiLiang() + jn11.lanLiangS;
                            x = rw.getLanLiang() + jn11.lanLiangL+r;
                            break;
                        case 6:
                            System.out.println("你选择了【六脉神剑】");
                            System.out.println("你打出一套六脉神剑 " + rw1.getName() + "被打的口吐鲜血");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn12.lanLiangS-r)+"伤害");
                            x = rw.getLanLiang() + jn12.lanLiangL;
                            y = rw1.getXuiLiang() + jn12.lanLiangS-r;
                            break;
                        case 7:
                            System.out.println("你选择了【葵花宝典】");
                            System.out.println("你打出一套葵花宝典 " + rw1.getName() + "被打的口吐鲜血");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn13.lanLiangS-r)+"伤害");
                            x = rw.getLanLiang() + jn13.lanLiangL;
                            y = rw1.getXuiLiang() + jn13.lanLiangS-r;
                            break;
                        case 8:
                            System.out.println("你选择了【九阴真经】");
                            System.out.println("你打出一套九阴真经 " + rw1.getName() + "轻松应对");
                            System.out.println(rw.getName()+"对"+rw1.getName()+"造成了: "+ (jn2.lanLiangS)+"伤害");
                            x = rw.getLanLiang() + jn14.lanLiangL+r;
                            y1 = rw.getXuiLiang() + jn13.lanLiangS;
                            break;
                        default:
                            System.out.println("抱歉,输入错误 请重新输入");
                            continue;
                    }
                    System.out.println("\t\t" + rw.getName() + "\t\t\t\t\t" + rw1.getName());
                    System.out.println("\t\t" + "血量 ："+y1 + "    \t\t" + "血量 ："+y);
                    System.out.println("\t\t" + "蓝量 ："+x + "    \t\t" + "蓝量 ："+x1);
                }
                 rw.setLanLiang(x);
                 rw1.setXuiLiang(y);
                 rw1.setLanLiang(x1);
                 rw.setXuiLiang(y1);
                if (rr == 0 && y !=0) {
                    Random rrr = new Random();
                    int rrrr = rrr.nextInt(11);
                    if (x1 >= 100 && rrrr % 2 == 0) {
                        System.out.println(rw1.getName() + "选择了【降龙十八掌】");
                        System.out.println(rw1.getName() + "打出一套降龙十八掌法 " + rw.getName() + "被打的口吐鲜血");
                        System.out.println(rw1.getName()+"对"+rw.getName()+"造成了: "+ (jn4.lanLiangS-rrrr)+"伤害");
                        x1 = rw1.getLanLiang() + jn4.lanLiangL;
                        y1 = rw.getXuiLiang() + jn4.lanLiangS*2-rrrr;
                    } else if (x1 >= 20) {
                        System.out.println(rw1.getName() + "选择了【擒龙功】");
                        System.out.println(rw1.getName() + "打出一套擒龙功 " + rw.getName() + "被打的不知所措");
                        System.out.println(rw1.getName()+"对"+rw.getName()+"造成了: "+ (jn7.lanLiangS-rrrr)+"伤害");
                        x1 = rw1.getLanLiang() + jn7.lanLiangL;
                        y1 = rw.getXuiLiang() + jn7.lanLiangS*2-rrrr;
                    } else {
                        System.out.println(rw1.getName() + "选择了【普通攻击】");
                        System.out.println(rw1.getName() + "打出一套虾米拳法 " + rw.getName() + "轻松应对");
                        System.out.println(rw1.getName()+"对"+rw.getName()+"造成了: "+ (jn0.lanLiangS-rrrr)+"伤害");
                        x1 = rw1.getLanLiang();
                        y1 = rw.getXuiLiang() + jn0.lanLiangS*2-rrrr;
                    }
                    if (y>0) {
                        System.out.println("\t\t" + rw.getName() + "\t\t\t\t\t" + rw1.getName());
                        System.out.println("\t\t" + "血量 ："+y1 + "    \t\t" + "血量 ："+y);
                        System.out.println("\t\t" + "蓝量 ："+x + "    \t\t" + "蓝量 ："+x1);
                    }
                }
                if (rr == 1 && y !=0) {
                    Random rrr = new Random();
                    int rrrr = rrr.nextInt(11);
                    if (x1 >= 80 && rrrr % 2 == 0) {
                        System.out.println(rw1.getName() + "选择了【燃木刀法】");
                        System.out.println(rw1.getName() + "打出一套燃木刀法 " + rw.getName() + "被打的口吐鲜血");
                        System.out.println(rw1.getName()+"对"+rw.getName()+"造成了: "+ (jn6.lanLiangS-rrrr)+"伤害");
                        x1 = rw1.getLanLiang() + jn6.lanLiangL;
                        y1 = rw.getXuiLiang() + jn6.lanLiangS*2-rrrr;
                    } else if (x1 >= 20) {
                        System.out.println(rw1.getName() + "选择了【小无相功】");
                        System.out.println(rw1.getName() + "打出一套小无相功 " + rw.getName() + "毫发无损");
                        System.out.println(rw1.getName()+"对"+rw.getName()+"造成了: "+ (jn5.lanLiangS)+"伤害");
                        x1 = rw1.getLanLiang() + jn5.lanLiangL*2+rrrr;
                        y1 = rw.getXuiLiang() + jn5.lanLiangS;
                    } else {
                        System.out.println(rw1.getName() + "选择了【普通攻击】");
                        System.out.println(rw1.getName() + "打出一套虾米拳法 " + rw.getName() + "轻松应对");
                        System.out.println(rw1.getName()+"对"+rw.getName()+"造成了: "+ (jn0.lanLiangS-rrrr)+"伤害");
                        x1 = rw1.getLanLiang();
                        y1 = rw.getXuiLiang() + jn0.lanLiangS*2-rrrr;
                    }
                    if (y>0) {
                        System.out.println("\t\t" + rw.getName() + "\t\t\t\t\t" + rw1.getName());
                        System.out.println("\t\t" + "血量 ："+y1 + "    \t\t" + "血量 ："+y);
                        System.out.println("\t\t" + "蓝量 ："+x + "    \t\t" + "蓝量 ："+x1);
                    }
                }
                if (rr == 2 && y !=0) {
                    Random rrr = new Random();
                    int rrrr = rrr.nextInt(11);
                    if (x1 >= 80 && rrrr % 2 == 0) {
                        System.out.println(rw1.getName() + "选择了【金刚不坏神功】");
                        System.out.println(rw1.getName() + "打出一套金刚不坏神功 " + rw.getName() + "被打的口吐鲜血");
                        System.out.println(rw1.getName()+"对"+rw.getName()+"造成了: "+ (jn9.lanLiangS-rrrr)+"伤害");
                        x1 = rw1.getLanLiang() + jn9.lanLiangL;
                        y1 = rw.getXuiLiang() + jn9.lanLiangS*2-rrrr;
                    } else if (x1 >= 20) {
                        System.out.println(rw1.getName() + "选择了【易筋经】");
                        System.out.println(rw1.getName() + "打出一套易筋经 " + rw.getName() + "毫发无损");
                        System.out.println(rw1.getName()+"对"+rw.getName()+"造成了: "+ (jn8.lanLiangS)+"伤害");
                        x1 = rw1.getLanLiang() + jn8.lanLiangL*2+rrrr;
                        y1 = rw.getXuiLiang() + jn8.lanLiangS;
                    } else {
                        System.out.println(rw1.getName() + "选择了【普通攻击】");
                        System.out.println(rw1.getName() + "打出一套虾米拳法 " + rw.getName() + "轻松应对");
                        System.out.println(rw1.getName()+"对"+rw.getName()+"造成了: "+ (jn0.lanLiangS-rrrr)+"伤害");
                        x1 = rw1.getLanLiang();
                        y1 = rw.getXuiLiang() + jn0.lanLiangS*2-rrrr;
                    }
                    if (y>0) {
                        System.out.println("\t\t" + rw.getName() + "\t\t\t\t\t" + rw1.getName());
                        System.out.println("\t\t" + "血量 ："+y1 + "    \t\t" + "血量 ："+y);
                        System.out.println("\t\t" + "蓝量 ："+x + "    \t\t" + "蓝量 ："+x1);
                    }
                }
                 i++;
                rw.setLanLiang(x);
                rw1.setXuiLiang(y);
                rw1.setLanLiang(x1);
                rw.setXuiLiang(y1);
                if (rw1.getXuiLiang() <= 0) {
                    xyz = true;
                    break;
                } else if  (rw.getXuiLiang() <= 0) {
                     xyz = false;
                     break;
                 }
            }
            if (xyz) {
                return true;
            }
            return false;
        }
            }
