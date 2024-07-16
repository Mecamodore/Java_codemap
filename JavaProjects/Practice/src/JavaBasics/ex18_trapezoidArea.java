package JavaBasics;

//求梯形面积，上底15，下底25，上底的三角形面积为150，输出保留两位小数
public class ex18_trapezoidArea {
    public static void main(String[] args) {
        //上底
        double a = 15;
        //下底
        double b = 25;
        //高
        double h = 150 * 2 / a ;
        //面积
        double s = (a + b) * h / 2;
        System.out.printf("%.2f",s);
    }
}
