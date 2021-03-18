package chapter04._03_circulation;

public class Cycle {
    public static void main(String[] args){
        int a = 100;
        while (a == 60){
            System.out.println("ok1");
            a--;
        }
        int b = 100;
        do {
            System.out.println("OK2");
            b--;
        }while (b==60);
    }
}
