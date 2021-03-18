package chapter04._02_getif;

public class Getif {
    public static void main(String[] args) {
        int x = 45;
        int y = 12;
        if (x > y) {
            System.out.println("变量x大于y");
        } else if (x < y) {
            System.out.println("变量x小于y");
        }

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
