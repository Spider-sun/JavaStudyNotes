package chapter05._01_String;

//获取字符串  substring(int beginIndex)
//通过String类的substring()方法可对字符串进行截取。该方法返回的是从指定索引位置开始截取到该字符串结尾的字串。
public class StrSplit {
    public static void main(String[] args) {
        String str = "Hello World";         //定义字符串 str
        String substr = str.substring(3);   //获取字符串，此时substr值为 lo World
        String substr2 = str.substring(0, 3);   //对字符串进行截取
        System.out.println(substr);
        System.out.println(substr2);
    }
}
