package Chapter04;
//定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：
//5/9*(华氏温度-100)，求华氏温度对应的摄氏温度
public class temperature_ex03 {
    public static void main(String[] args){
        //定义华氏温度
        double Fahrenheit = 200.2;
        //定义摄氏度
        double Celsius = 5.0 / 9 * (Fahrenheit - 100);
        //输出
        System.out.println("Celsius = " + Celsius);
    }
}
