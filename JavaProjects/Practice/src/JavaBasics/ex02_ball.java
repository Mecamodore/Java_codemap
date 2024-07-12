package JavaBasics;

import java.util.Scanner;

public class ex02_ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 不断读取输入，直到没有更多的输入
        while (scanner.hasNext()) {
            // 读取一个实数，表示球的半径
            double radius = scanner.nextDouble();
            // 计算球的体积，公式为 (4/3) * π * r^3
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            // 输出结果，保留三位小数
            System.out.printf("%.3f%n", volume);
        }
        scanner.close();
    }
}
