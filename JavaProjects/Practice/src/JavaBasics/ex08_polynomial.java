package JavaBasics;

import java.util.Scanner;

//对于多项式f(x) = ax^3 + bx^2 + cx + d 和给定的a, b, c, d, x，计算f(x)的值。
//输入：输入仅一行，包含5个实数，分别是x，及参数a、b、c、d的值，每个数都是绝对值不超过100的双精度浮点数。数与数之间以一个空格分开
//输出：输出一个实数，即f(x)的值，保留到小数点后7位。
public class ex08_polynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //实数x、a、b、c、d
        double x = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        //结果
        double result = a * Math.pow(x,3) + b * Math.pow(x,2) + c * x + d;
        System.out.printf("%.7f",result);
    }
}
