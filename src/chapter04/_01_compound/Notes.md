###复合语句
1) {}内为代码块，即复合语句。
2) 复合语句中定义的变量为局部变量，仅可在复合语句中使用。
```public class Compound {
    public static void main(String[] args) {
        int x = 20;
        {
            int y = 40;
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b = y > z;
                System.out.println(b);
            }
        }
    }
}
