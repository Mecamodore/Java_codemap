package JavaBasics;

import java.util.Scanner;

//数学中经典的“鸡兔同笼”问题，已知头共x个，脚共y只，问笼中的鸡和兔各有多少只?
//输入：头和脚的数量
//输出：鸡和兔各自数量。一个空格隔开。
public class ex19_chickenRabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //头
        int head = sc.nextInt();
        //脚
        int foot = sc.nextInt();
        //兔子数
        int rabbit = (foot - head * 2) / 2;
        //鸡数
        int chicken = head - rabbit;
        System.out.println(chicken+" "+rabbit);
    }
}
