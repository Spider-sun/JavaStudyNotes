### String类

#### 声明字符串

`String s;`

#### 创建字符串

1) String(char a[])

```java
//用一个字符数组a创建String对象。
public class StringClass {
    public static void main(String[] args) {
        char a[] = {'g', 'o', 'o', 'd'};
        String s = new String(a);
        // 等价于
        String ss = new String("good");
        // 等价于
        String sss;
        sss = "good";
    }
}
```

#### 连接字符串

1) 连接多个字符串

```java
// 使用运算符'+'进行连接
public class join {                              //创建类
    public static void main(String[] args) {     //主方法
        String s1 = new String("hello");        //声明String对象s1
        String s2 = new String("world");        //声明String对象s2
        String s = s1 + " " + s2;               //将s1和s2的连接结果赋值给s
        System.out.println(s);                  //将s输出
    }
}
```

2) 连接其他数据类型

```java
//字符串可以与其他基本数据类型进行连接，连接时，其他数据会直接转换为字符串
public class Link {
    public static void main(String[] args) {
        int booktime = 4;
        float practice = 2.5f;
        // 将字符串与整型、浮点型变量相连，并将结果输出
        System.out.println("我每天花费" + booktime + "小时看书；" + practice + "小时上机练习。");
    }
}
```

3) 获取字符串信息

```java
//获取字符串长度  str.length();
public class StrLength {
    public static void main(String[] args) {
        String str = "We are students";
        int size = str.length();
    }
}

//字符串查找
//str.indexOf(substr)      查找首次出现的索引位置
//str.lastIndexOf(substr)  查找最后一次出现的索引位置
//charAt(index)            获取索引位置的字符
public class StrFind {
    public static void main(String[] args) {
        String str = "We are students";
        int size1 = str.indexOf("s");        //首次出现
        int size2 = str.lastIndexOf("s");    //最后一次出现
        int size2 = str.charAt(5);    //获取索引位置的字符
    }
}
```

4) 字符串操作

```java
import java.util.Date;

//获取字符串  substring(int beginIndex)
//通过String类的substring()方法可对字符串进行截取。该方法返回的是从指定索引位置开始截取到该字符串结尾的字串。
public class StrSplit {
    public static void main(String[] args) {
        String str = "Hello World";         //定义字符串 str
        String substr = str.substring(3);   //获取字符串，此时substr值为 lo World
        String substr2 = str.substring(0, 3);   //对字符串进行截取，此时substr2值为 Hel
    }
}

//去除空格  str.trim()
public class StrBlak {
    public static void main(String[] args) {
        String str = " Java  class  ";
        str = str.trim();           //去除两边空格
        System.out.println(str);    //输出结果"Java  class"
    }
}

//字符串替换  str.replace(char oldChar, char newChar)
public class NewStr {
    public static void main(String[] args) {
        String str = "address";
        // 将字符串str中的字符”a"替换成"A"
        String newstr = str.replace("a", "A");
        System.out.println(newstr);
    }
}

//判断字符串的开头与结尾
public class StartOrEnd {
    public static void main(String[] args) {
        String num1 = "22045612";
        String num2 = "21304578";
        boolean b = num1.startsWith("22");      //判断字符串num1是否以"22"开头
        boolean b2 = num1.endsWith("78");       //判断字符串num1是否以"78"结尾
        boolean b3 = num2.startsWith("22");      //判断字符串num2是否以"22"开头
        boolean b4 = num2.endsWith("78");      //判断字符串num2是否以"78"结尾
        System.out.println("字符串num1是以'22'开始的吗？" + b);       //true
        System.out.println("字符串num1是以'78结尾始的吗？" + b2);     //false
        System.out.println("字符串num2是以'22'开始的吗？" + b3);     //false
        System.out.println("字符串num2是以'78'结尾的吗？" + b4);     //true
    }
}

//判断字符串是否相等
//不能使用"=="进行判断
public class IsOrNot {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("ABC");
        boolean b = (s1 == s2);  // b: false  字符串不相等
        boolean b2 = s1.equals(s2);  // b: true  字符串相等, 区分大小写
        boolean b3 = s1.equalsIgnoreCase(s3);  // b: true  字符串相等, 不区分大小写
    }
}

// 按字典顺序比较两个字符串  str.compareTo(String otherstr)
// 按照Unicode编码比较，如果在前为正数，在后为负数
public class Wordbook {
    public static void main(String[] args) {
        String str = new String("b");
        String str2 = new String("a");
        String str3 = new String("c");
        System.out.println(str + " compareTo " + str2 + ":" + str.compareTo(str2));  //将str与str2比较的结果输出: 1
        System.out.println(str + " compareTo " + str3 + ":" + str.compareTo(str3));  //将str与str2比较的结果输出: -1
    }
}

//字符的大小写转换
//toLowerCase()  将字符串转小写
//toUpperCase()  将字符串转大写
public class UpAndLower {
    public static void main(String[] args) {
        String str = new String("abc DEF");
        String newstr = str.toLowerCase();      //转小写：abc def
        String newstr2 = str.toUpperCase();      //转大写：ABC DEF
    }
}

//字符串分割  str.split(String sign)
public class Division {
    public static void main(String[] args) {
        //创建字符串
        String str = "192.168.0.1";
        //按照"."进行分割，使用转义字符"\\."
        String[] firstArray = str.split("\\.");
        //按照"."进行两次分割，使用转义字符"\\."
        String[] secondArray = str.split("\\.", 2);
        //输出str原值
        System.out.println("str的原值为：[" + str + "]");
        //输出全部分割的结果
        System.out.println("全部分割的结果：");
        for (String a : firstArray) {
            System.out.println("[" + a + "]");
        }
        System.out.println();  // 换行
        //输出分割两次的结果
        System.out.println("分割两次的结果");
        for (String a : secondArray) {
            System.out.println("[" + a + "]");
        }
        System.out.println();
    }
}

//格式化字符串
public class GetDate {
    public static void main(String[] args) {
        Date date = new Date();
        //日期格式化
        String te = String.format("%te", date);     //一个月中的某一天 (1~31)
        String tb = String.format("%tb", date);     //指定语言月份简称 (Feb)
        String tB = String.format("%tB", date);     //指定语言月份全称 (February)
        String tA = String.format("%tA", date);     //指定语言星期几全称 (Monday)
        String ta = String.format("%ta", date);     //指定语言星期几简称 (Mon)
        String tc = String.format("%tc", date);     //包含全部日期和时间信息 (星期二 三月 25 13：37：22 CST 2008)
        String tY = String.format("%tY", date);     //四位年份 (2008)
        String tj = String.format("%tj", date);     //一年中的第几天 (085)
        String tm = String.format("%tm", date);     //月份 (03)
        String td = String.format("%td", date);     //一个月中的第几天 (01~31)
        String ty = String.format("%ty", date);     //两位年份 (08)
        //时间格式化
        String tH = String.format("%tH", date);     //2位数字的24小时制的小时 (00~23)
        String tI = String.format("%tI", date);     //2位数字的12小时制的小时 (01~12)
        String tk = String.format("%tk", date);     //2位数字的24小时制的小时 (0~23)
        String tl = String.format("%tl", date);     //2位数字的24小时制的小时 (1~12)
        String tM = String.format("%tM", date);     //2位数字的分钟 (00~59)
        String tS = String.format("%tS", date);     //2位数字的秒数 (00~60)
        String tL = String.format("%tL", date);     //3位数字的毫秒数 (000~999)
        String tN = String.format("%tN", date);     //9位数字的微秒数 (000000000~999999999)
        String tp = String.format("%tp", date);     //指定语言下上午或下午的标记 (上午 or pm)
        String tz = String.format("%tz", date);     //相对于GMT RFC 82格式的数字时区偏移量 (+0800)
        String tZ = String.format("%tZ", date);     //时区缩写形式的字符串 (CST)
        String ts = String.format("%ts", date);     //1970-01-01 00:00:00至今经过的秒数 (10位时间戳)
        String tQ = String.format("%tQ", date);     //1970-01-01 00:00:00至今经过的毫秒数 (13位时间戳)
        //常见的日期转换
        String tF = String.format("%tF", date);     //"年-月-日"格式(4位年份)  2008-03-25
        String tD = String.format("%tD", date);     //"月/日/年"格式(2位年份)  03/25/08
        String tr = String.format("%tr", date);     //"时:分:秒 PM(AM)"格式(12时制)  03:22:06 下午
        String tT = String.format("%tT", date);     //"时:分:秒"格式(24时制)  15:23:50
        String tr = String.format("%tr", date);     //"时:分"格式(24时制)  15:25
        //常规类型格式化
        String b = String.format("%b", 3 > 5);      //结果被格式化布尔类型 (true)
        String B = String.format("%B", 3 > 5);      //结果被格式化布尔类型 (true)
    }
}
```

5) 正则表达式

```
元字符         正则表达式中的写法           意义
.              .                          代表任意一个字符
\d             \\d                        代表0~9的任何一个数字
\D             \\D                        代表任意一个非数字字符
\s             \\s                        代表空白字符
\S             \\S                        代表非空白字符
\w             \\w                        代表可用作标识符的字符，但不包括“$”
\W             \\W                        代表不可用于标识符的字符
\p{Lower}      \\p{Lower}                 代表小写字母a~z
\p{Upper}      \\p{Upper}                 代表大写字母A~Z
\p{ASCII}      \\P{ASCII}                 ASCII字符
\p{Alpha}      \\p{Alpha}                 字母字符
\p{Digit}      \\p{Digit}                 十进制数字，即0~9
\p{Alnum}      \\p{Alnum}                 数字或者字母字符
\p{Punct}      \\p{Punct}                 标点符号：!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
\p{Graph}      \\p{Graph}                 可见字符：[\p{Alnum}\p{Punct}]
\p{Print}      \\p{Print}                 可打印字符：[\p{Graph}\x20]
\p{Blank}      \\p{Blank}                 空格或制表符：[\t]
\p{Cntrl}      \\p{Cntrl}                 控制字符：[\x00-\x1F\x7F]
```

```java
public class Judge {
    public static void main(String[] args) {
        //定义要匹配E-mail地址的正则表达式
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1 = "aaa@";
        String str2 = "aaaaa";
        String str3 = "1111@111ffyu.dfg.com";
        if (str1.matches(regex)) {  //判断字符串变量是否与正则表达式匹配
            System.out.println(str1 + "是一个合法的E-mail地址格式");
        } else if (str2.matches(regex)) {
            System.out.println(str2 + "是一个合法的E-mail地址格式");
        } else if (str3.matches(regex)) {
            System.out.println(str3 + "是一个合法的E-mail地址格式");
        }
    }
}
```

6) 字符串生成器
```java
public class Jerque {
    public static void main(String[] args) {
        //创建普通的字符串
        String str = "";
        //定义对字符串执行操作的起始时间
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("String消耗时间：" + time);
        
        //创建字符串生成器
        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int j = 0; j < 10000; j++) {
            builder.append(j);
        }
        endTime = System.currentTimeMillis();
        time = endTime - startTime;
        System.out.println("StringBuilder消耗时间：" + time);
    }
}
```