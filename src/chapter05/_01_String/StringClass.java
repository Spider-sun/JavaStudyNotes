package chapter05._01_String;

public class StringClass {
    public static void main(String[] args){
        char a[] = {'g', 'o', 'o', 'd'};
        String s = new String(a);
        // 等价于
        String ss = new String("good");
        // 等价于
        String sss;
        sss = "good";
    }
}
