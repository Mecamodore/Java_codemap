package JavaBasics;

import java.util.Scanner;

//一只大象口渴了，要喝20升水才能解渴，但现在只有一个深h厘米，底面半径为r厘米的小圆桶(h和r都是整数)。问大象至少要喝多少桶水才会解渴。
//输入有一行：包行两个整数，以一个空格分开，分别表示小圆桶的深h和底面半径r，单位都是厘米。
//输出一行，包含一个整数，表示大象至少要喝水的桶数。
public class ex12_elephantDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //大象喝水20L，相当于20000立方厘米
        int water = 20000;
        //桶高h
        int h = sc.nextInt();
        //桶底面半径r
        int r = sc.nextInt();
        //圆周率pi
        float pi = 3.14159f;
        //桶体积
        float v = pi * r * r * h;
        //计算桶数量
        float count = water / v;
        //使用ceil方法对count向上取整，即只要有小数，就给整数加1，再舍去小数
        int result = (int) Math.ceil(count);
        System.out.println(result);
    }
}
