package JavaBasics;

import java.util.Scanner;

//已知线段的两个端点的坐标A（Xa,Ya），B（Xb，Yb），求线段AB的长度。
//输入共两行。
//第一行是两个实数Xa，Ya，即A的坐标。
//第二行是两个实数Xb，Yb，即B的坐标。
//输入中所有实数的绝对值均不超过10000
//输出一个实数，即线段AB的长度，保留到小数点后3位。
public class ex14_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A的坐标，实数Xa，Xb
        double Xa = sc.nextDouble();
        double Xb = sc.nextDouble();
        if(Xa<-10000||Xa>10000||Xb<-10000||Xb>10000){
            System.out.println("ERROR");
        }else{
            double Ya = sc.nextDouble();
            double Yb = sc.nextDouble();
            if(Ya<-10000||Ya>10000||Yb<-10000||Yb>10000){
                System.out.println("ERROR");
            }else{
                double length = Math.sqrt(Math.pow(Xa-Ya, 2) + Math.pow(Xb-Yb, 2));
                System.out.printf("%.3f",length);
            }
        }
    }
}
