package chapter04._03_circulation;

public class Circulate {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 2; i <= 100; i += 2){
            sum = sum + i;
        }
        // 输出相加后的结果
        System.out.println("2到100之间的所有偶数之和为：" + sum);
    }
}