public class class3_10 {
    public static void main(String[] args){
        double x=8844430;
        int count=0;
        double paper=0.1;
        while (paper<=x) {
            paper *= 2;
            count++;
        }
            System.out.println("需要折叠多少次：" + count);

    }
}
