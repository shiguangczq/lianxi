package idea.ui;

import java.util.Random;

public class SuiJiShu {

    public SuiJiShu() {
    }



    public static String  shiJiShu(String  [] suiJiShi ){
            char c = 0;
            String s2 = null;
            Random r = new Random();
            int i1 = r.nextInt(10)+1;
            int i3 = r.nextInt(suiJiShi.length);
            StringBuilder sb1 = new StringBuilder();
            String [] s =new String[suiJiShi.length];
            for (int i = 0; i < suiJiShi.length; i++) {
                StringBuilder sb = new StringBuilder();
                int i2;
                if(i1<=5){
                    i2 = r.nextInt(26) + 65;
                }else {
                    i2 = r.nextInt(26) + 97;
                }
                c = (char) i2;
                String s1 = sb.append(c).toString();
                s[i] = s1;
                i1 = r.nextInt(10);
            }
            String s1 = sb1.append(i1).toString();
            s[i3]=s1;


            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < suiJiShi.length; i++) {
                sb2.append(s[i]);
            }
            s2 = sb2.toString();
            return s2;
        }


    public String toString() {
        return "SuiJiShu{}";
    }
}
