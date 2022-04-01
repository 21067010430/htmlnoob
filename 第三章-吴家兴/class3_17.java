import java.util.Scanner;

public class class3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("等腰三角形由多行'*'号组成，请输入'*'的行数：" );

        int line = sc.nextInt();
        if (line <= 1) {
            System.out.println("须输入大于1的自然数！");
        } else {
            for (int i = 1; i <= line; i++) {
                for (int j = 1; j <= line - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
