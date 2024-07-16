package JavaBasics;

import java.util.Scanner;

//计算甲流疫情死亡率，根据确诊数和死亡数
//输入仅一行，有两个整数，第一个为确诊数，第二个为死亡数。
//输出仅一行，甲流死亡率，以百分数形式输出，精确到小数点后3位。
//提示：输出%可以使用printf(“%%”);
public class ex07_deathRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //确诊数
        int confirmed  = sc.nextInt();
        //死亡数
        int death = sc.nextInt();
        //死亡率
        double deathRate = (double) death / confirmed * 100;
        //判断死亡数是否为0
        if(death == 0){
            System.out.printf("%.3f%%",death);
        }else{
            System.out.printf("%.3f%%",deathRate);
        }
    }
}
