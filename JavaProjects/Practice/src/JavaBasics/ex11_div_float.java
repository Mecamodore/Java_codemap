package JavaBasics;

import java.util.Scanner;
//计算两个双精度浮点数a和b的相除的余数，a和b都是正数的。这里余数（r）的定义是：a = k * b + r，其中 k是整数， 0 <= r < b。
//输入仅一行，包括两个双精度浮点数a和b
//输出也仅一行，a÷b的余数
public class ex11_div_float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a
        double a = sc.nextDouble();
        //b
        double b = sc.nextDouble();
        //r
        double r= a / b;
        System.out.printf("%f",r);
    }
}
