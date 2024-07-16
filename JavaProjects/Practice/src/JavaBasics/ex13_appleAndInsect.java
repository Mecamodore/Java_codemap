package JavaBasics;

import java.util.Scanner;

//你买了一箱n个苹果，很不幸的是买完时箱子里混进了一条虫子。虫子每x小时能吃掉一个苹果，
// 假设虫子在吃完一个苹果之前不会吃另一个，那么经过y小时你还有多少个完整的苹果？
//输入仅一行，包括n，x和y（均为整数）。输入数据保证y <= n * x。
//输出也仅一行，剩下的苹果个数。
//注意：是要求完整的苹果数。
public class ex13_appleAndInsect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //苹果总数n
        int n = sc.nextInt();
        //虫子每x小时吃完一个苹果
        int x = sc.nextInt();
        //经过的时间y（小时）
        int y = sc.nextInt();
        if(y > n * x){
            System.out.println("Error");
        }else {
            int res = n - (y + x - 1) / x;
            System.out.println(res);
        }
    }
}
