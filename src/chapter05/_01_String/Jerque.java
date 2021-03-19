package chapter05._01_String;

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