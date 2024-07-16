package JavaBasics;

import java.util.Scanner;

//平面上有一个三角形，它的三个顶点坐标分别为(x1, y1), (x2, y2), (x3, y3)，那么请问这个三角形的面积是多少。
//输入仅一行，包括6个单精度浮点数，分别对应x1, y1, x2, y2, x3, y3。
//输出也是一行，输出三角形的面积，精确到小数点后两位。
//根据海伦公式算，面积为根号下s*(s-a)*(s-b)*(s-c)，s=(a+b+c)/2
public class ex15_triangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //顶点坐标
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float x3 = sc.nextFloat();
        float y3 = sc.nextFloat();
        //计算边长
        double a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double c = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
        //定义s
        double s =( a + b + c) / 2;
        //计算面积A
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}
