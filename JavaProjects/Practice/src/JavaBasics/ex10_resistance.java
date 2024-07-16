package JavaBasics;

import java.util.Scanner;

//对于阻值为r1和r2的电阻，其并联电阻阻值公式计算如下：R = 1/(1/r1 + 1/r2)
//输入：两个电阻阻抗大小，浮点型，以一个空格分开。
//输出：并联之后的阻抗大小，结果保留小数点后2位。
//提示：计算过程使用float类型。
public class ex10_resistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //电阻r1、r2
        float r1 = sc.nextFloat();
        float r2 = sc.nextFloat();
        //结果
        float resistance = 1/(1/r1+1/r2);
        System.out.printf("%.2f",resistance);
    }
}
