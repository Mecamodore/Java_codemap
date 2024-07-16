package JavaBasics;

import java.util.Scanner;

//某幼儿园里，有5个小朋友编号为1、2、3、4、5，他们按自己的编号顺序围坐在一张圆桌旁。他们身上都有若干个糖果(键盘输入)，
// 现在他们做一个分糖果游戏。从1号小朋友开始，将自己的糖果均分三份（如果有多余的糖果，则立即吃掉），
// 自己留一份，其余两份分给他的相邻的两个小朋友。接着2号、3号、4号、5号小朋友同样这么做。问一轮后，每个小朋友手上分别有多少糖果。
//输入：5个小朋友的糖果数。
//输出：游戏后5个小朋友的糖果数。(按5位宽度输出)
public class ex20_candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candies = new int[5];
        //遍历输入
        for (int i = 0; i < 5; i++) {
            candies[i] = sc.nextInt();
        }
        //进行游戏
        for (int i = 0; i < 5; i++) {
            int num = candies[i] / 3;
            candies[i] = num;
            candies[(i + 1) % 5] += num ;
            candies[(i + 4) % 5] += num;
        }
        //输出
        for (int i = 0; i < 5 ; i++) {
            System.out.printf("%5d",candies[i]);
        }
    }
}
