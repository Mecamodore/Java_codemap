package Chapter04;
//假如还有59天放假，问：合xx个星期零xx天
public class ArithmeticOperator_ex02 {
    public static void main(String[] args){
        //定义假期，初始化变量，赋值59
        int holiday = 59;
        //定义星期数
        int weeks = holiday / 7;
        //定义天数
        int days = holiday % 7;
        //输出结果
        System.out.println("还有59天放假，合"+weeks+"个星期"+days+"天");
    }
}
