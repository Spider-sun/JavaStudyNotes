package chapter05._01_String;

//不能使用"=="进行判断
public class IsOrNot{
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("ABC");
        boolean b = (s1 == s2);  // b: false  字符串不相等
        boolean b2 = s1.equals(s2);  // b: true  字符串相等, 区分大小写
        boolean b3 = s1.equalsIgnoreCase(s3);  // b: true  字符串相等, 不区分大小写
        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);
    }
}
