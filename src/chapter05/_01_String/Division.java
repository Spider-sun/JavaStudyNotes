package chapter05._01_String;

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