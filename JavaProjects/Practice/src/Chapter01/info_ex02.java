package Chapter01;
//第一章作业二：输出个人信息（姓名、性别、籍贯、住址），每条信息各占一行
public class info_ex02 {
    public static void main(String[] args){
        //这里输出结果是中文乱码，推测是字符编码问题，把UTF-8改成GBK即可解决
        System.out.println("姓名\t性别\t籍贯\t住址\n小明\t男\t保定\t翻斗家园");
    }
}
