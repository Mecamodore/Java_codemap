package Chapter04;
//打印九九乘法表
public class nine_ex06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}

