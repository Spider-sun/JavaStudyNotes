### 循环语句

#### while循环语句

```
while(条件语句){
    执行语句
}
```

eg:

```java
public class GetSum {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 10) {
            sum = sum + x;
            x++;
        }
        System.out.println("sum = " + sum);
    }
}
```

#### do...while循环语句

```
do
{
    执行语句
}
while(条件表达式)
```

```java
public class Cycle {
    public static void main(String[] args) {
        int a = 100;
        while (a == 60) {
            System.out.println("ok1");
            a--;
        }
        int b = 100;
        do {
            System.out.println("OK2");
            b--;
        } while (b == 60);
    }
}
```

####for循环语句
```
for (表达式1; 表达式2; 表达式3){
    语句序列
}
```