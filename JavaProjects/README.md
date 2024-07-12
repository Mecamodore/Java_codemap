#  JAVA基础学习

## 内容大纲

**学习内容**：建立编程思想（第一章到第七章）、提升编程能力（第八章到第十九章）、增强分析需求和代码的实现能力（第二十章到第二十七章）

**学习方法**：明确需求，使用已经学过的技术考虑能否实现，不能实现寻找新技术，先了解一下技术的特性，熟悉基础的指令和语法，做出一些简单的模板项目，先简单地实现出来，然后优化项目，理解新技术的底层原理，以此循环螺旋上升

**资源推荐(后续可能更新)：**

> - 菜鸟教程：[Java 教程 | 菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-tutorial.html)
> - 视频课程：[韩顺平 零基础30天学会Java](https://www.bilibili.com/video/BV1fh411y7R8/)

## 第一章 概述

### 学习前要了解的内容

#### 就业方向

做Java后端开发是主要的就业方向，不过还有其他选择。大部分人学Java都是为了做后端开发，但也可以做全栈开发。

#### 应用场景

- **企业软件**：如电商平台、新闻网站等。
- **安卓软件**：虽然现在更多使用Kotlin，但Java依然可以用于Android开发。
- **嵌入式领域**：如POS机、汽车中控、电动牙刷等，不过这个领域更多使用ASM、C语言。

#### IDE安装

**推荐使用IDEA**

安装过程非常简单，选择好安装位置并一直点击“下一步”，最后勾选添加到系统环境变量即可。

**选择JDK**

进入IDE后，需要选择JDK。JDK（Java Development Kit）是提供给程序开发人员的开发工具包，包括JRE（Java Runtime Environment）和开发工具集。JRE是Java运行环境，包括JVM（Java Virtual Machine）和核心类库。JVM是Java的虚拟机。

初看可能有些复杂，这里只需要明白：
- 如果你是程序员，你需要下载的是JDK。
- 如果你只是想运行Java程序，不需要设计程序，可以只下载Java的运行环境JRE。

**选择JDK版本**

一般来说，选择长期支持版（LTS），如JDK8、JDK11、JDK17。目前安装IDEA默认是安装JDK17，这里推荐使用JDK17即可。

了解完上述内容，安装好开发工具后，可以正式开始Java的学习了。

首先，我想知道Java作为一种编程语言有什么特性呢？

### Java的特性

- **面向对象语言**：与面向过程语言不同，Java是一种面向对象的编程语言。
- **解释型语言**：通过解释器解释后，可以在多平台运行（通过各个平台的JVM虚拟机运行）。
- **健壮性**：Java具有很高的健壮性，能够有效地处理异常情况。

### 1.转义字符

在Java中，转义字符（Escape Character）是用于在字符串中表示一些特殊字符或实现某些特定功能的字符序列。转义字符通常以反斜杠 (`\`) 开头，后跟一个或多个字符，表示一个非打印或有特殊含义的字符。常见的转义字符包括：

- `\n`：换行符（Line Feed），用于表示换行。
- `\r`：回车符（Carriage Return），用于回到当前行的开头。
- `\t`：水平制表符（Horizontal Tab），用于表示一个制表符。
- `\'`：单引号，用于在字符串中表示一个单引号。
- `\"`：双引号，用于在字符串中表示一个双引号。
- `\\`：反斜杠，用于在字符串中表示一个反斜杠。
- `\b`：退格符（Backspace），用于删除前一个字符。
- `\f`：换页符（Form Feed），用于移动到下一页的开头。

下面是一个示例，展示了如何在字符串中使用转义字符：

```java
public class EscapeCharacterExample {
    public static void main(String[] args) {
        String text = "这是一个示例\n包括几个转义字符：\n\t- 换行符（\\n）\n\t- 水平制表符（\\t）\n\t- 双引号（\\\"）";
        System.out.println(text);
    }
}
```

输出结果为：

```
这是一个示例
包括几个转义字符：
    - 换行符（\n）
    - 水平制表符（\t）
    - 双引号（\"）
```

转义字符在处理字符串中特殊字符时非常有用，能够使得代码更加清晰和可读。

### 2.注释

在Java编程中，注释用于在代码中添加说明文字，以帮助开发者理解代码的功能和逻辑。注释不会被编译器执行，因此对程序的运行没有任何影响。Java中有三种类型的注释：

1. **单行注释（Single-line Comment）**：
   使用双斜杠 (`//`) 开头，注释内容从 `//` 开始到行末结束。用于简短的说明或注解。
   ```java
   // 这是一个单行注释
   int x = 10; // 声明一个整数变量并赋值
   ```

2. **多行注释（Multi-line Comment）**：
   使用 `/*` 开头，`*/` 结尾，可以跨越多行。用于较长的说明或屏蔽多行代码。
   ```java
   /*
    * 这是一个多行注释
    * 可以跨越多行
    */
   int y = 20;
   ```

3. **文档注释（Documentation Comment）**：
   使用 `/**` 开头，`*/` 结尾。可以用来为类、方法和字段添加注释，生成Javadoc文档。
   ```java
   /**
    * 这是一个文档注释
    * 用于描述类、方法或字段
    */
   public class Example {
       /**
        * 这是main方法，是程序的入口
        * @param args 命令行参数
        */
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```

使用注释的最佳实践包括：
- **简洁明了**：注释应当简明扼要，直接说明代码的目的或功能。
- **保持更新**：当代码发生变化时，及时更新相关注释，确保注释与代码一致。
- **避免过多**：注释过多会影响代码的可读性，应当只在必要时添加注释。

注释在团队协作和代码维护中起着重要作用，有助于提高代码的可读性和可维护性。

### 3.Java代码规范

Java代码规范是为了确保代码的一致性、可读性和可维护性而制定的一系列准则。以下是一些重要的Java代码规范：

#### 1. **命名规范**

- **类名**：使用大驼峰命名法（Pascal Case），每个单词的首字母大写。例如：`MyClass`、`EmployeeDetails`。
- **方法名**：使用小驼峰命名法（Camel Case），第一个单词小写，其余单词的首字母大写。例如：`calculateTotal`、`getEmployeeName`。
- **变量名**：使用小驼峰命名法，尽量简洁且有意义。例如：`totalAmount`、`employeeId`。
- **常量名**：使用全大写字母，单词之间用下划线分隔。例如：`MAX_VALUE`、`DEFAULT_TIMEOUT`。

#### 2. **缩进与格式**

- **缩进**：使用4个空格进行缩进，不要使用Tab。
- **花括号**：花括号 `{}` 通常不换行，遵循如下格式：
  ```java
  if (condition) {
      // code block
  } else {
      // code block
  }
  ```
- **行长**：每行代码长度不要超过80个字符，尽量保持每行代码简短。

#### 3. **空格与空行**

- **操作符两边空格**：在操作符（如 `=`、`+`、`-`、`*`、`/`）两边加上空格。
  ```java
  int sum = a + b;
  ```
- **关键字后加空格**：在关键字（如 `if`、`for`、`while`）后面加一个空格。
  ```java
  if (x > y) {
      // code block
  }
  ```
- **空行**：在方法之间、逻辑块之间适当添加空行，增强代码可读性。

#### 4. **注释**

- **单行注释**：使用 `//` 注释一行内容。
  ```java
  // 计算总金额
  int total = price * quantity;
  ```
- **多行注释**：使用 `/* */` 注释多行内容。
  ```java
  /*
   * 这是一个多行注释
   * 可以跨越多行
   */
  ```
- **文档注释**：使用 `/** */`，为类、方法、字段添加注释，便于生成Javadoc文档。
  ```java
  /**
   * 计算两个数的和
   * @param a 第一个数
   * @param b 第二个数
   * @return 两数之和
   */
  public int add(int a, int b) {
      return a + b;
  }
  ```

#### 5. **包结构**

- **包名**：使用全小写字母，多个单词之间用点分隔。例如：`com.example.project`。

#### 6. **代码组织**

- **类**：每个源文件只包含一个公共类，类名与文件名一致。
- **方法**：每个方法只实现一个功能，方法长度不要过长。

#### 7. **异常处理**

- 使用 `try-catch` 处理异常，确保程序的健壮性。
- 在捕获异常时，尽量捕获具体的异常类型，而不是直接捕获 `Exception`。

```java
try {
    // code that may throw an exception
} catch (IOException e) {
    // handle IOException
} catch (Exception e) {
    // handle other exceptions
}
```

遵循这些代码规范，可以提高代码的可读性、可维护性，便于团队协作和代码审查。

### 4.DOS命令(了解)

DOS（Disk Operating System）是一个早期的操作系统，提供了命令行界面来管理文件和运行程序。即使在现代操作系统中，许多DOS命令仍然可以通过命令提示符（Command Prompt）使用。以下是一些常用的DOS命令：

1. **`dir`**：显示指定目录中的文件和子目录列表。
   ```sh
   dir
   ```

2. **`cd`（Change Directory）**：更改当前目录。
   ```sh
   cd C:\Users\YourName
   ```

3. **`md`（Make Directory）**：创建一个新目录。
   ```sh
   md newfolder
   ```

4. **`rd`（Remove Directory）**：删除一个目录。
   ```sh
   rd oldfolder
   ```

5. **`del`**：删除一个或多个文件。
   ```sh
   del file.txt
   ```

6. **`copy`**：复制文件从一个位置到另一个位置。
   ```sh
   copy file.txt C:\Users\YourName\Documents
   ```

7. **`move`**：移动文件或重命名文件。
   ```sh
   move file.txt C:\Users\YourName\Documents
   ```

8. **`ren`（Rename）**：重命名文件或目录。
   ```sh
   ren oldname.txt newname.txt
   ```

9. **`type`**：显示文件的内容。
   ```sh
   type file.txt
   ```

10. **`exit`**：退出命令提示符。
   ```sh
   exit
   ```

### 绝对路径与相对路径

在文件系统中，路径用于指定文件或目录的位置。路径分为绝对路径和相对路径：

#### 绝对路径

绝对路径是从根目录开始，完整地指定文件或目录的位置。它不依赖于当前工作目录，无论当前位置是什么，绝对路径始终指向同一个位置。

- **Windows示例**：
  ```sh
  C:\Users\YourName\Documents\file.txt
  ```

- **Unix/Linux示例**：
  ```sh
  /home/yourname/documents/file.txt
  ```

#### 相对路径

相对路径是相对于当前工作目录的路径。它不包含根目录，而是从当前目录开始指定文件或目录的位置。

- **示例**：
  ```sh
  documents\file.txt
  ```
  如果当前工作目录是 `C:\Users\YourName`，则上述路径指向 `C:\Users\YourName\documents\file.txt`。

- **特殊符号**：
  - `.`：表示当前目录。
  - `..`：表示上一级目录。

  ```sh
  .\file.txt      # 当前目录中的file.txt
  ..\file.txt     # 上一级目录中的file.txt
  ```

上述讲解如果觉得有些难理解，可以看如下例子：

![绝对路径和相对路径](D:\Projects\JavaProjects\%E7%BB%9D%E5%AF%B9%E8%B7%AF%E5%BE%84%E5%92%8C%E7%9B%B8%E5%AF%B9%E8%B7%AF%E5%BE%84.png)

此时，我要从红色部分文件，访问蓝色文件，以绝对路径和相对路径进行访问

如果用绝对路径访问的话，应该是C:\abc2\test4\Hello.txt，这个倒是一目了然，不用太多解释

用相对路径，..\\..\abc2\test4\Hello.txt，这里的..\表示去往上级目录，因为此时红色文件是在test目录下，所以需要先回到上级abc目录下，再回到C盘目录下，然后再进入abc2、test4，访问到Hello.txt

理解绝对路径和相对路径对于文件和目录操作非常重要，有助于准确定位和管理文件。

## 第二章 变量

在Java中，变量用于存储数据。每个变量都有一个类型，用于指定它可以存储的数据种类。Java中的数据类型主要分为两类：**基本数据类型**和**引用数据类型**。

### 1. 基本数据类型

基本数据类型是Java语言中最基本的数据类型，Java总共有8种基本数据类型：

#### 整数类型
- **byte**：8位，范围从 -128 到 127。
  ```java
  byte b = 100;
  ```
- **short**：16位，范围从 -32,768 到 32,767。
  ```java
  short s = 1000;
  ```
- **int**：32位，范围从 -2^31 到 2^31-1。
  ```java
  int i = 100000;
  ```
- **long**：64位，范围从 -2^63 到 2^63-1。
  ```java
  long l = 100000L;
  ```

#### 浮点类型
- **float**：32位，单精度浮点数。
  ```java
  float f = 10.5f;
  ```
- **double**：64位，双精度浮点数。
  ```java
  double d = 20.5;
  ```

#### 字符类型
- **char**：16位，表示一个Unicode字符。
  ```java
  char c = 'A';
  ```

#### 布尔类型
- **boolean**：表示 `true` 或 `false`。
  ```java
  boolean bool = true;
  ```

### 2. 引用数据类型

引用数据类型用于引用对象，包括类、接口和数组。

#### 类（Class）
- 类是面向对象编程的核心，类的实例被称为对象。
  ```java
  String str = "Hello, World!";
  ```

#### 接口（Interface）
- 接口是一种抽象类型，定义了类必须实现的一组方法。
  ```java
  Runnable runnable = new Runnable() {
      public void run() {
          // 代码
      }
  };
  ```

#### 数组（Array）
- 数组是一种容器，可以容纳固定数量的相同类型的元素。
  ```java
  int[] arr = {1, 2, 3, 4, 5};
  ```

### 变量声明与初始化

变量在使用前必须声明，声明变量时需要指定变量的类型和名称，可以同时进行初始化。

```java
// 声明并初始化变量
int number = 10;
String message = "Hello, Java";

// 声明变量
double price;
boolean isAvailable;

// 初始化变量
price = 19.99;
isAvailable = true;
```

### 变量作用域

变量的作用域指的是变量在程序中的可见范围。Java中有四种主要的作用域：

1. **局部变量**：在方法或代码块内部声明的变量，仅在该方法或代码块中可见。
   ```java
   public void myMethod() {
       int localVar = 5; // 局部变量
   }
   ```

2. **实例变量**：在类中声明，但在方法、构造器或代码块之外，属于类的每个实例。
   ```java
   public class MyClass {
       int instanceVar; // 实例变量
   }
   ```

3. **类变量**（静态变量）：使用 `static` 关键字声明，属于类，而不是类的每个实例。
   ```java
   public class MyClass {
       static int classVar; // 类变量
   }
   ```

4. **参数变量**：方法或构造函数的参数，在方法或构造函数内部可见。
   ```java
   public void myMethod(int paramVar) { // 参数变量
       // 使用参数变量
   }
   ```

### 常量

常量是指在程序运行期间其值不可以改变的变量，使用 `final` 关键字声明常量。

```java
final int MAX_VALUE = 100;
```

总结起来，变量在Java中是非常基础且重要的概念，正确地使用和管理变量对于编写高效、可维护的Java程序至关重要。

### 基本数据类型转换

在Java中，基本数据类型的转换分为两种：**自动类型转换**（也称为隐式类型转换）和**强制类型转换**（也称为显式类型转换）。了解和掌握这些转换方法对于避免数据丢失和类型不匹配的错误至关重要。

#### 1. 自动类型转换

自动类型转换是指在满足一定条件下，Java编译器自动将一种基本数据类型转换为另一种更大范围的类型。自动类型转换通常发生在以下几种情况下：

- 将较小范围的类型转换为较大范围的类型。

自动类型转换的顺序如下（从小到大）：
```
byte -> short -> int -> long -> float -> double
```

示例：
```java
int a = 100;
long b = a;    // int 自动转换为 long
float c = b;   // long 自动转换为 float
```

#### 2. 强制类型转换

强制类型转换是指将一种数据类型显式地转换为另一种数据类型，这通常是将较大范围的类型转换为较小范围的类型，或者在自动类型转换不适用的情况下进行。强制类型转换可能会导致数据丢失。

强制类型转换的语法如下：
```java
目标类型 变量名 = (目标类型) 要转换的值;
```

示例：
```java
double x = 9.78;
int y = (int) x;    // double 强制转换为 int，结果是 9
```

#### 示例代码

以下示例展示了自动类型转换和强制类型转换：

```java
public class TypeCastingExample {
    public static void main(String[] args) {
        // 自动类型转换
        int a = 100;
        long b = a;         // int 自动转换为 long
        float c = b;        // long 自动转换为 float
        double d = c;       // float 自动转换为 double
        
        System.out.println("自动类型转换：");
        System.out.println("int: " + a);
        System.out.println("long: " + b);
        System.out.println("float: " + c);
        System.out.println("double: " + d);

        // 强制类型转换
        double x = 9.78;
        int y = (int) x;    // double 强制转换为 int
        short z = (short) y; // int 强制转换为 short
        
        System.out.println("\n强制类型转换：");
        System.out.println("double: " + x);
        System.out.println("int: " + y);
        System.out.println("short: " + z);

        // 特殊情况：char 和 int 之间的转换
        char ch = 'A';
        int ascii = (int) ch;   // char 强制转换为 int，得到字符的ASCII码
        System.out.println("\n字符转换：");
        System.out.println("char: " + ch);
        System.out.println("ASCII: " + ascii);
    }
}
```

输出结果：
```
自动类型转换：
int: 100
long: 100
float: 100.0
double: 100.0

强制类型转换：
double: 9.78
int: 9
short: 9

字符转换：
char: A
ASCII: 65
```

#### 特别注意

- **数据丢失**：在强制类型转换时，可能会发生数据丢失。例如，将 `double` 转换为 `int` 时，小数部分会被舍弃。
- **溢出**：将较大范围的数值强制转换为较小范围的类型时，可能会发生溢出，导致结果不正确。例如，将 `long` 转换为 `short` 时，如果数值超过 `short` 的范围，结果会出错。

理解和正确应用基本数据类型转换可以帮助你在编写Java代码时避免不必要的错误，提高程序的健壮性和可维护性。

## 第三章 运算符

在Java中，运算符（Operators）是用于执行各种操作的符号。Java提供了丰富的运算符，可以分为以下几类：算术运算符、关系运算符、逻辑运算符、位运算符、赋值运算符、条件运算符和其他运算符。

### 1. 算术运算符

用于执行基本的数学运算。

- **加法** (`+`)
  ```java
  int sum = 10 + 5; // 15
  ```
- **减法** (`-`)
  ```java
  int difference = 10 - 5; // 5
  ```
- **乘法** (`*`)
  ```java
  int product = 10 * 5; // 50
  ```
- **除法** (`/`)
  ```java
  int quotient = 10 / 5; // 2
  ```
- **取余** (`%`)
  ```java
  int remainder = 10 % 3; // 1
  ```
- **自增** (`++`)
  ```java
  int a = 10;
  a++; // a 变为 11
  ```
- **自减** (`--`)
  ```java
  int b = 10;
  b--; // b 变为 9
  ```

#### 注意事项

- **整数除法**：如果除数是0会引发 `ArithmeticException`，且整数除法会舍弃小数部分。
  ```java
  int result = 10 / 0; // 这会抛出 ArithmeticException
  int quotient = 10 / 3; // quotient 的值是 3
  ```

- **溢出问题**：超出基本数据类型的范围会发生溢出。
  ```java
  int maxInt = Integer.MAX_VALUE; // 2147483647
  int overflow = maxInt + 1; // 这会导致溢出，overflow 的值是 -2147483648
  ```

- **浮点数比较**：浮点数运算可能会有精度问题，建议使用 `Math.abs` 方法比较浮点数的差值是否在一个允许的范围内。
  ```java
  double a = 1.0 / 3.0;
  double b = 0.333333333;
  if (Math.abs(a - b) < 0.000001) {
      System.out.println("a 和 b 大致相等");
  }
  ```

- **自增运算符和自减运算符：**

  1. 前置自增运算符 (`++a`): 先将变量的值增加1，然后再使用该变量的值。

  2. 前置自减运算符 (`--a`): 先将变量的值减少1，然后再使用该变量的值。

     ```java
     int a = 5;
     int b = ++a; // a 先加1，a 的值变为 6，然后 b 赋值为 6
     ```

     *在前置操作中，变量的值在表达式计算之前就已经改变，因此后续使用的是改变后的值。*

  3. 后置自增运算符(`a++`): 先使用变量的当前值，然后再将其值增加1。

  4. 后置自减运算符 (`a--`): 先使用变量的当前值，然后再将其值减少1。

     ```java
     int a = 5;
     int b = a++; // b 赋值为 a 当前的值 5，然后 a 加1，a 的值变为 6
     ```

     *在后置操作中，变量的值在表达式计算之后才会改变，因此使用的是未改变的值，表达式计算完成后再进行增减操作。*

  5. 在独立使用时

     如果自增或自减运算符独立使用，不会出现任何区别。

     ```java
     int a = 5;
     a++; // a 的值变为 6
     ++a; // a 的值变为 7
     ```

  6. 在复杂表达式中

     在复杂表达式中使用前置和后置运算符时，需要特别注意它们的不同影响。

     ```java
     int a = 5;
     int b = 10;
     int result = a++ + b; // result = 5 + 10，a 之后变为 6
     int result2 = ++a + b; // a 先变为 7，然后 result2 = 7 + 10
     ```

     在这种情况下，选择前置或后置运算符会直接影响表达式的结果。

  7. 在循环中使用

     在循环中，前置和后置运算符的效果不同会影响循环体的执行次数。

     ```java
     for (int i = 0; i < 5; ++i) {
         System.out.println(i); // 输出 0, 1, 2, 3, 4
     }

     for (int i = 0; i < 5; i++) {
         System.out.println(i); // 输出 0, 1, 2, 3, 4
     }
     ```

     对于循环条件的影响是一样的，但在循环体内使用自增/自减时需要注意其顺序对循环逻辑的影响。

  8. 在方法调用中

     在方法调用中使用前置和后置运算符，传递给方法的值会不同。

     ```java
     public void printValue(int value) {
         System.out.println(value);
     }

     int a = 5;
     printValue(a++); // 输出 5，之后 a 变为 6
     printValue(++a); // a 先变为 7，然后输出 7
     ```

     在这种情况下，前置和后置运算符会影响传递给方法的参数值。

  9. 总结

     **前置运算符**先改变变量的值，然后再使用它，因此在表达式计算前变量值已更新。

     **后置运算符**先使用变量的当前值，然后再改变它，因此在表达式计算前变量值未更新。

### 2. 关系运算符

用于比较两个值，并返回布尔值 (`true` 或 `false`)。

- **等于** (`==`)
  ```java
  boolean isEqual = (10 == 10); // true
  ```
- **不等于** (`!=`)
  ```java
  boolean isNotEqual = (10 != 5); // true
  ```
- **大于** (`>`)
  ```java
  boolean isGreater = (10 > 5); // true
  ```
- **小于** (`<`)
  ```java
  boolean isLesser = (5 < 10); // true
  ```
- **大于等于** (`>=`)
  ```java
  boolean isGreaterOrEqual = (10 >= 5); // true
  ```
- **小于等于** (`<=`)
  ```java
  boolean isLesserOrEqual = (5 <= 10); // true
  ```

#### 注意事项

- **引用类型比较**：`==` 比较的是引用类型的内存地址，而不是实际内容。要比较字符串或其他对象的内容，应该使用 `equals` 方法。
  ```java
  String str1 = new String("hello");
  String str2 = new String("hello");
  boolean isEqual = (str1 == str2); // false，因为内存地址不同
  boolean isContentEqual = str1.equals(str2); // true，因为内容相同
  ```

### 3. 逻辑运算符

用于连接布尔表达式并返回布尔结果。

- **逻辑与** (`&&`)
  ```java
  boolean andResult = (true && false); // false
  ```
- **逻辑或** (`||`)
  ```java
  boolean orResult = (true || false); // true
  ```
- **逻辑非** (`!`)
  ```java
  boolean notResult = !true; // false
  ```

#### 注意事项

- **短路运算**：`&&` 和 `||` 是短路运算符，当左边的表达式能决定整个表达式的值时，右边的表达式不会被计算。这可以避免一些不必要的计算，但要注意避免依赖右边表达式的副作用。
  ```java
  int a = 10;
  if (a > 5 || ++a > 15) {
      // a > 5 为 true，右边的 ++a 不会被执行
      System.out.println(a); // 输出 10
  }
  ```

### 4. 位运算符

用于对整数类型的位进行操作。

- **按位与** (`&`)
  ```java
  int bitwiseAnd = 5 & 3; // 1
  ```
- **按位或** (`|`)
  ```java
  int bitwiseOr = 5 | 3; // 7
  ```
- **按位异或** (`^`)
  ```java
  int bitwiseXor = 5 ^ 3; // 6
  ```
- **按位取反** (`~`)
  ```java
  int bitwiseNot = ~5; // -6
  ```
- **左移** (`<<`)
  ```java
  int leftShift = 5 << 1; // 10
  ```
- **右移** (`>>`)
  ```java
  int rightShift = 5 >> 1; // 2
  ```
- **无符号右移** (`>>>`)
  ```java
  int unsignedRightShift = 5 >>> 1; // 2
  ```

#### 注意事项

- **优先级问题**：位运算符的优先级较低，有时需要使用括号来明确表达式的计算顺序。
  ```java
  int a = 5;
  int b = 3;
  int result = a & b + 2; // 等同于 a & (b + 2)
  ```

### 5. 赋值运算符

用于给变量赋值。

- **基本赋值** (`=`)
  ```java
  int x = 10;
  ```
- **加法赋值** (`+=`)
  ```java
  x += 5; // 相当于 x = x + 5;
  ```
- **减法赋值** (`-=`)
  ```java
  x -= 5; // 相当于 x = x - 5;
  ```
- **乘法赋值** (`*=`)
  ```java
  x *= 5; // 相当于 x = x * 5;
  ```
- **除法赋值** (`/=`)
  ```java
  x /= 5; // 相当于 x = x / 5;
  ```
- **取余赋值** (`%=`)
  ```java
  x %= 5; // 相当于 x = x % 5;
  ```
- **按位与赋值** (`&=`)
  ```java
  x &= 5; // 相当于 x = x & 5;
  ```
- **按位或赋值** (`|=`)
  ```java
  x |= 5; // 相当于 x = x | 5;
  ```
- **按位异或赋值** (`^=`)
  ```java
  x ^= 5; // 相当于 x = x ^ 5;
  ```
- **左移赋值** (`<<=`)
  ```java
  x <<= 5; // 相当于 x = x << 5;
  ```
- **右移赋值** (`>>=`)
  ```java
  x >>= 5; // 相当于 x = x >> 5;
  ```
- **无符号右移赋值** (`>>>=`)
  ```java
  x >>>= 5; // 相当于 x = x >>> 5;
  ```

#### 注意事项

- **连续赋值**：连续赋值时，从右向左进行赋值。
  ```java
  int a, b, c;
  a = b = c = 10; // a, b, c 都被赋值为 10
  ```
- **注意值传递**：Java 是值传递，对于基本数据类型，赋值后变量独立；对于引用类型，赋值后多个变量指向同一个对象。
  ```java
  int x = 5;
  int y = x;
  y = 10;
  // x 仍然是 5

  int[] arr1 = {1, 2, 3};
  int[] arr2 = arr1;
  arr2[0] = 10;
  // arr1[0] 变为 10
  ```

### 6. 条件运算符

条件运算符（三元运算符）用于根据布尔表达式的结果返回一个值。

- **三元运算符** (`? :`)
  ```java
  int result = (a > b) ? a : b; // 如果 a 大于 b，
  ```

返回 a，否则返回 b
  ```

#### 注意事项

- **嵌套条件运算符**：尽量避免嵌套条件运算符，否则会降低代码的可读性。
  ```java
  int a = 10;
  int b = 5;
  int max = (a > b) ? a : b;
  ```

### 7. 特殊运算符和方法

- **instanceof**：用于测试对象是否是一个特定类的实例。
  ```java
  if (obj instanceof String) {
      // 如果 obj 是 String 的实例，执行此代码块
  }
  ```
- **字符串连接运算符** (`+`)
  ```java
  String message = "Hello" + " World"; // "Hello World"
  ```

#### 注意事项

- **字符串连接**：使用 `+` 进行字符串连接时，尽量使用 `StringBuilder` 或 `StringBuffer` 来提高性能，尤其是在循环中。
  ```java
  String result = "";
  for (int i = 0; i < 100; i++) {
      result += i; // 性能低
  }

  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < 100; i++) {
      sb.append(i); // 性能高
  }
  ```

### 8. 运算符优先级

了解运算符的优先级和结合性，避免在复杂表达式中产生意外的结果。必要时使用括号明确表达式的计算顺序。

```java
int result = 10 + 5 * 2; // result 是 20，而不是 30
int correctResult = (10 + 5) * 2; // result 是 30
```

### 9. NullPointerException

在进行对象操作前，确保对象不是 `null`，以避免 `NullPointerException`。

```java
String str = null;
if (str != null && str.length() > 0) {
    // 避免 NullPointerException
}
```

### 10. 多线程问题

在多线程环境中，注意使用同步机制避免竞争条件和数据不一致。

```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
```

---

通过理解和遵循这些注意事项，可以有效避免常见的错误，并编写出更健壮和可维护的Java代码。

### 输入

在Java中，`Scanner`类是用于获取用户输入的常用工具类。`Scanner`类位于`java.util`包中，提供了一系列方法用于从各种输入源（如控制台、文件、字符串等）中读取数据。

#### 引入`Scanner`类

首先需要引入`java.util.Scanner`类：

```java
import java.util.Scanner;
```

#### 创建`Scanner`对象

`Scanner`对象可以从不同的数据源创建，最常见的是从控制台（标准输入）创建：

```java
Scanner scanner = new Scanner(System.in);
```

#### 从控制台读取输入

`Scanner`类提供了许多方法用于读取不同类型的数据，包括整数、浮点数、字符串等。

##### 1. 读取字符串

```java
System.out.print("Enter your name: ");
String name = scanner.nextLine(); // 读取一整行输入
System.out.println("Your name is: " + name);
```

##### 2. 读取整数

```java
System.out.print("Enter your age: ");
int age = scanner.nextInt(); // 读取一个整数
System.out.println("Your age is: " + age);
```

##### 3. 读取浮点数

```java
System.out.print("Enter your height: ");
double height = scanner.nextDouble(); // 读取一个浮点数
System.out.println("Your height is: " + height);
```

#### 常用方法

- `nextLine()`: 读取一整行输入，直到遇到换行符。
- `next()`: 读取下一个标记（以空格、换行符等为分隔符）。
- `nextInt()`: 读取下一个整数。
- `nextDouble()`: 读取下一个双精度浮点数。
- `nextBoolean()`: 读取下一个布尔值。
- `nextFloat()`: 读取下一个浮点数。
- `nextLong()`: 读取下一个长整数。
- `nextShort()`: 读取下一个短整数。
- `hasNext()`: 检查是否还有下一个标记。
- `hasNextInt()`: 检查是否还有下一个整数。
- `hasNextDouble()`: 检查是否还有下一个双精度浮点数。

#### 示例代码

以下是一个综合示例，展示了如何使用`Scanner`从控制台读取不同类型的输入：

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取字符串
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);

        // 读取整数
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        // 读取浮点数
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is: " + height);

        // 读取布尔值
        System.out.print("Are you a student (true/false)? ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Are you a student: " + isStudent);

        // 关闭扫描器
        scanner.close();
    }
}
```

#### 注意事项

1. **避免输入类型不匹配**：使用`nextInt()`、`nextDouble()`等方法时，如果输入的数据类型不匹配，会抛出`InputMismatchException`。可以使用`hasNextInt()`、`hasNextDouble()`等方法先检查输入类型。
    ```java
    if (scanner.hasNextInt()) {
        int number = scanner.nextInt();
    } else {
        System.out.println("Please enter a valid integer.");
    }
    ```

2. **处理换行符**：使用`nextInt()`、`nextDouble()`等方法后，如果再使用`nextLine()`读取字符串，需要处理换行符。可以在读取整数或浮点数后加一个`nextLine()`来消费掉换行符。
    ```java
    int age = scanner.nextInt();
    scanner.nextLine(); // 消费掉换行符
    String name = scanner.nextLine();
    ```

3. **关闭`Scanner`对象**：使用完`Scanner`对象后，应关闭它以释放相关资源。
    ```java
    scanner.close();
    ```

### 数制转换及原码、反码、补码

#### 数制转换

##### 整数的数制转换

**1. 十进制转二进制、八进制、十六进制**

- **十进制转二进制**：将十进制数不断除以2，记录余数，直到商为0，然后将所有余数逆序排列。
  - 例如，将42转为二进制：
    ```
    42 / 2 = 21 ... 0
    21 / 2 = 10 ... 1
    10 / 2 = 5  ... 0
    5  / 2 = 2  ... 1
    2  / 2 = 1  ... 0
    1  / 2 = 0  ... 1
    所以42的二进制表示是101010。
    ```

- **十进制转八进制**：将十进制数不断除以8，记录余数，直到商为0，然后将所有余数逆序排列。
  - 例如，将42转为八进制：
    ```
    42 / 8 = 5 ... 2
    5  / 8 = 0 ... 5
    所以42的八进制表示是52。
    ```

- **十进制转十六进制**：将十进制数不断除以16，记录余数，直到商为0，然后将所有余数逆序排列，余数在10到15之间时，用A到F表示。
  - 例如，将42转为十六进制：
    ```
    42 / 16 = 2 ... A (10)
    所以42的十六进制表示是2A。
    ```

**2. 二进制、八进制、十六进制转十进制**

- **二进制转十进制**：将二进制数的每一位与对应的2的幂次相乘，然后求和。
  - 例如，将101010转为十进制：
    ```
    1*2^5 + 0*2^4 + 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 32 + 0 + 8 + 0 + 2 + 0 = 42
    ```

- **八进制转十进制**：将八进制数的每一位与对应的8的幂次相乘，然后求和。
  - 例如，将52转为十进制：
    ```
    5*8^1 + 2*8^0 = 40 + 2 = 42
    ```

- **十六进制转十进制**：将十六进制数的每一位与对应的16的幂次相乘，然后求和。
  - 例如，将2A转为十进制：
    ```
    2*16^1 + 10*16^0 = 32 + 10 = 42
    ```

**3. 二进制、八进制、十六进制之间的转换**

- **二进制转八进制**：将二进制数每三位一组，从右到左分组，不足三位的前面补零，然后将每组转换为对应的八进制数。
  - 例如，将101010转为八进制：
    ```
    101 010 -> 52
    ```

- **二进制转十六进制**：将二进制数每四位一组，从右到左分组，不足四位的前面补零，然后将每组转换为对应的十六进制数。
  - 例如，将101010转为十六进制：
    ```
    0010 1010 -> 2A
    ```

- **八进制转二进制**：将每一位八进制数转换为对应的三位二进制数。
  - 例如，将52转为二进制：
    ```
    5 -> 101
    2 -> 010
    所以52的二进制表示是101010。
    ```

- **十六进制转二进制**：将每一位十六进制数转换为对应的四位二进制数。
  - 例如，将2A转为二进制：
    ```
    2 -> 0010
    A -> 1010
    所以2A的二进制表示是101010。
    ```

##### 小数的数制转换

**1. 十进制小数转二进制、八进制、十六进制**

- **十进制小数转二进制**：将小数部分不断乘以2，记录整数部分，直到小数部分为0或达到所需精度，然后将所有整数部分按顺序排列。
  - 例如，将0.625转为二进制：
    ```
    0.625 * 2 = 1.25 -> 1
    0.25  * 2 = 0.5  -> 0
    0.5   * 2 = 1.0  -> 1
    所以0.625的二进制表示是0.101。
    ```

- **十进制小数转八进制**：将小数部分不断乘以8，记录整数部分，直到小数部分为0或达到所需精度，然后将所有整数部分按顺序排列。
  - 例如，将0.625转为八进制：
    ```
    0.625 * 8 = 5.0 -> 5
    所以0.625的八进制表示是0.5。
    ```

- **十进制小数转十六进制**：将小数部分不断乘以16，记录整数部分，直到小数部分为0或达到所需精度，然后将所有整数部分按顺序排列。
  - 例如，将0.625转为十六进制：
    ```
    0.625 * 16 = 10.0 -> A
    所以0.625的十六进制表示是0.A。
    ```

**2. 二进制、八进制、十六进制小数转十进制**

- **二进制小数转十进制**：将二进制小数的每一位与对应的2的负幂次相乘，然后求和。
  - 例如，将0.101转为十进制：
    ```
    1*2^-1 + 0*2^-2 + 1*2^-3 = 0.5 + 0 + 0.125 = 0.625
    ```

- **八进制小数转十进制**：将八进制小数的每一位与对应的8的负幂次相乘，然后求和。
  - 例如，将0.5转为十进制：
    ```
    5*8^-1 = 5*0.125 = 0.625
    ```

- **十六进制小数转十进制**：将十六进制小数的每一位与对应的16的负幂次相乘，然后求和。
  - 例如，将0.A转为十进制：
    ```
    A*16^-1 = 10*0.0625 = 0.625
    ```

##### 二进制、八进制、十六进制小数之间的转换

与整数转换类似，可以将小数部分转换为相应的二进制、八进制或十六进制。

#### 原码、反码、补码

在计算机系统中，整数通常用二进制表示，并且有原码、反码和补码三种表示方法。这些表示方法主要用于解决符号位和负数表示的问题。

##### 1. 原码

原码是指二进制整数的直接表示，最高位为符号位，0表示正数，1表示负数。

- 正数：原码就是其二进制形式，符号位为0。
  - 例如，5的原码是`0000 0101`
- 负数：符号位为1，其余位为数值的绝对值的二进制表示。
  - 例如，-5的原码是`1000 0101`

##### 2. 反码

反码用于表示负数，正数的反码与原码相同，负数的反码是对原码取反（除了符号位）。

- 正数：反码与原码相同。
  - 例如，5的反码是`0000 0101`
- 负数：符号位为1，其余位取反。
  - 例如，-5的原码是`1000 0101`
  - -5的反码是`1111 1010`

##### 3. 补码

补码是现代计算机系统中普遍采用的一种表示负数的方法。正数的补码与原码相同，负数的补码是其反码加1。

- 正数：补码与原码相同。
  - 例如，5的补码是`0000 0101`
- 负数：反码加1。
  - 例如，-5的原码是`1000 0101`
  - -5的反码是`1111 1010`
  - -5的补码是`1111 1011`

#### 小结

- **原码**：符号位加上数值绝对值的二进制表示。
- **反码**：正数的反码与原码相同；负数的反码是对原码取反（符号位不变）。
- **补码**：正数的补码与原码相同；负数的补码是反码加1。

通过理解这些数制转换和表示方法，可以更好地理解计算机内部的整数表示和计算机制。这些概念在处理低级编程、位操作和理解系统底层工作原理时非常有用。









