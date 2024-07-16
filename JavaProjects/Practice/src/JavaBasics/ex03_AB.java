package JavaBasics;

import java.util.Scanner;

//A+B问题，输入两个自然数，输出他们的和。
public class ex03_AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}
