package JavaBasics;

import java.util.Scanner;

//带余除数
//输入：一行，包含两个整数，依次为被除数和除数（除数非零），中间用一个空格隔开。
//输出：一行，包含两个整数，依次为整数商和余数，中间用一个空格隔开。
public class ex06_div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //被除数
        int a = sc.nextInt();
        //除数
        int b = sc.nextInt();
        if(b==0){
            System.out.println("请输入正确的除数");
        }else{
            //整数商
            int c = a / b;
            //余数
            int d = a % b;
            //输出结果
            System.out.println(c+" "+d);
        }
    }
}
