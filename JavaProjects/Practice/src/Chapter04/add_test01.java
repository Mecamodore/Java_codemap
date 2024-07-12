package Chapter04;
//这个程序是用来研究自增自减运算符，明晰++i和i++的区别
public class add_test01 {
    public static void main(String[] args) {
        //给变量i赋值为1
        int i = 1;
        /*
            对于这一步进行分析
            相当于使用了一个临时变量temp
            执行了下面这个操作
            int temp = i
            i = i + 1
            i = temp
        */
        i = i++;
        //因此这里的输出结果仍然为1
        System.out.println(i);
        //如果想让输出结果为2，可以这样做
        /*
            int i = 1
            i++
            System.out.println(i)
            */
        //或者是这样
        // int i = 1
        // System.out.println(++i)
    }
}
