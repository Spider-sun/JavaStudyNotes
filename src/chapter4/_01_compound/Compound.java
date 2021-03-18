package chapter4._01_compound;

public class Compound {
    public static void main(String[] args) {
        int x = 20;
        // 复合语句
        {
            int y = 40;
            System.out.println(y);
            int z = 245;
            boolean b;
            // 复合语句
            {
                b = y > z;
                System.out.println(b);
            }
        }
    }
}
