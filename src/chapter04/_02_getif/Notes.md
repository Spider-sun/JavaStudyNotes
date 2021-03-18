###条件语句
####if条件语句
```
if (布尔表达式){
    语句序列
}
```
####if...else语句
```
if (布尔表达式){
    若干语句
}else{
    若干语句
}
```
####if...else if 多分支语句
```
if (条件表达式1){
    语句序列1
}else if (条件表达式2){
    语句序列2
}
...
else if (条件表达式n){
    语句序列n
}
```
####switch多分支语句
```
switch(表达式)
{
case 常量值1:
    语句块1
    [break;]
case 常量值2:
    语句块2
    [break;]
...
case 常量值n:
    语句块n
    [break;]
default:
    语句块n+1
}
```
eg:
```java
public class Getif {
    public static void main(String[] args) {
        String str = "殷都烂柯人";
        switch (str) {
            case "殷都":
                System.out.println("殷都");
                break;
            case "殷都烂柯人":
                System.out.println("殷都烂柯人");
                break;
            default:
                System.out.println("以上条件都不是");
        }
    }
}
```