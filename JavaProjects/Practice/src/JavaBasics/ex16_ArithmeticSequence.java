package JavaBasics;

import java.util.Scanner;

//给出一个等差数列的前两项a1，a2，求第n项是多少。
//输入：一行，包含三个整数a1，a2，n。-100 <= a1,a2 <= 100，0 < n <= 1000。
//输出：一个整数，即第n项的值。
public class ex16_ArithmeticSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //第一项
        int a1=sc.nextInt();
        //第二项
        int a2=sc.nextInt();
        //n
        int n=sc.nextInt();
        //公差d
        int d = a2 - a1;
        //第n项的值
        int res = a1 + (n - 1) * d;
        System.out.println(res);
    }
}
