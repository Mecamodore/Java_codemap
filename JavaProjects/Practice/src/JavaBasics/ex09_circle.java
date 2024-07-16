package JavaBasics;

import java.util.Scanner;

//给出圆的半径，求圆的直径、周长和面积。
//输入:输入包含一个实数r（0 < r <= 10,000），表示圆的半径。
//输出:输出一行，包含三个数，分别表示圆的直径、周长、面积，数与数之间以一个空格分开，每个数保留小数点后4位。
//提示：如果圆的半径是r，那么圆的直径、周长、面积分别是2*r、2 * pi * r、pi * r * r，其中约定pi＝3.14159。
//可以使用printf("%.4f", ...)实现保留小数点后4位。
public class ex09_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //半径
        double radius = sc.nextDouble();
        //判断直径是否越界
        if (radius < 0||radius > 10000) {
            System.out.println("Invalid radius");
        }else{
            //圆周率pi
            double pi = 3.14159;
            //直径
            double diameter = radius * 2;
            //周长
            double circumference = radius * 2 * pi;
            //面积
            double area = pi * radius * radius;
            //输出
            System.out.printf("%.4f %.4f %.4f",diameter,circumference,area);
        }
    }
}
