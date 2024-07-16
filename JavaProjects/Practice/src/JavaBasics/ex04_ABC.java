package JavaBasics;

import java.util.Scanner;

//输入仅一行，包括三个整数a、b、c, 数与数之间以一个空格分开。输出(A+B)*C
//(－10,000 < a,b,c < 10,000)
public class ex04_ABC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //判断abc是否满足取值范围，不满足输出提示信息
        if(a<-10000||a>10000){
            System.out.println("请输入正确的a");
        }else if(b<-10000||b>10000){
            System.out.println("请输入正确的b");
        }else if(c<-10000||c>10000){
            System.out.println("请输入正确的c");
        }else{
            //计算(a+b)*c
            int sum = (a + b) * c;
            System.out.println(sum);
        }
    }
}
