# Java基础题 题目与答案解析

## 题目

### 1.第一个程序

- **题目描述**

  同学们，动手写出第一个C语言或C++或Java或任意语言程序吧！

  打开你的编译器，打印一句话，在屏幕上显示出 Just do IT

  写下你的决心吧！


- **输入格式**

  没有输入，程序运行起来直接输出这句话就可以


- **输出格式**

  Just do IT


- **样例输入**

  ```
  无
  ```


- **样例输出**

  ```
  Just do IT
  ```

### 2.计算球体积

- **题目描述**

  根据输入的半径值，计算球的体积。

- **输入格式**

  输入数据有多组，每组占一行，每行包括一个实数，表示球的半径。

- **输出格式**

  输出对应的球的体积，对于每组输入数据，输出一行，计算结果保留三位小数。

- **样例输入**

  ```
  1
  1.5
  ```

- **样例输出**

  ```
  4.189
  14.137
  ```





## 答案解析

### 1.第一个程序

```java
public class Main {
	public static void main(String[] args) {
		System.out.println("Just do IT");
	}
}
```

> System.out.println()是输出

### 2.计算球体积

```java
import java.util.Scanner;

public class Main {
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
```

> 1. **输入输出**：
>    - 程序使用 `Scanner` 类来读取输入的半径值，可以处理多组输入。
>    - 使用 `while (scanner.hasNext())` 循环来不断读取输入，直到没有更多的输入为止。
> 2. **计算球体积**：
>    - 球的体积公式为 \( V = \frac{4}{3} \pi r^3 \)。
>    - 使用 `Math.pow(radius, 3)` 计算半径的三次方。
>    - 使用 `Math.PI` 获取 π 的值。
> 3. **格式化输出**：
>    - 使用 `System.out.printf("%.3f%n", volume)` 保留三位小数输出结果。



