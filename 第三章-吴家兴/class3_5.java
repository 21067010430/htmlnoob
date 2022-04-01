import java.util.Scanner;

public class class3_5 {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数(0_100):");
        int number = sc.nextInt();

        if (number<60){
            System.out.println("无奖励");
        }else if(number==60){
            System.out.println("奖励一个姚思怡");
        }else if(number>60&&number<80){
            System.out.println("奖励两个姚思怡");
        }else{
            System.out.println("奖励三个姚思怡");
        }
        System.out.println("结束");
    }
}
