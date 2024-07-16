package JavaBasics;

import java.util.Scanner;

//输入两个正整数A和B，求A*B。
//输入：一行，包含两个正整数A和B，中间用单个空格隔开。1 <= A,B <= 50000。
//输出：一个整数，即A*B的值。
//注意乘积的范围和数据类型的选择。
public class ex17_AB_mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入a、b
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<1||b<1||a>50000||b>50000){
            System.out.println("Invalid input");
        }else {
            int c = a * b;
            System.out.println(c);
        }
    }
}
