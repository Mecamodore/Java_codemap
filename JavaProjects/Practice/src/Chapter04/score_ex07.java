package Chapter04;

import java.util.Scanner;

//统计3 个班成绩情况，每个班有5 名同学，求出各个班的平均分和所有班级的平均分
public class score_ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //个人分数
        float score = 0;
        //各班总分
        float classScore = 0;
        //总分
        float sum = 0;
        //及格人数
        int pass = 0;
        //总及格人数
        int totalPass = 0;
        //三个班
        for(int i = 1;i <= 3;i++){
            //每个班五个同学
            for(int j = 1;j <= 5;j++){
                System.out.print(i+"班"+"第"+j+"个学生的成绩：");
                //这里直接用score存储班级的总分会导致
                //下面的if条件式判断出错
                //应该使用一个新变量存储班级总分
//                score += sc.nextInt();
                score = sc.nextFloat();
                classScore += score;
                if(score >= 60){
                    pass++;
                    totalPass++;
                }
                sum += score;
            }
            System.out.println(i+"班平均分："+classScore/5);
            System.out.println(i+"班及格人数："+pass);
            classScore = 0;
            pass = 0;
        }
        System.out.println("三个班平均分："+sum/15);
        System.out.println("三个班及格人数："+totalPass);
    }
}
