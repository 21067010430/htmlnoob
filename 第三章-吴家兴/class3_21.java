public class class3_21 {
    public static void main(String[] args){

        double d=1.72;
        System.out.println("您的身高为:"+d);

        int i=70;
        System.out.println("您的体重为:"+i);

        double B=i/(d*d);
        System.out.println("您的BMI指数为:"+B);

        System.out.println("您的体重属于:");

        if(B<18.5){
            System.out.println("体重过轻");
        }
        else if(B>18.5&&B<24.9){
            System.out.println("正常范围");
        }
        else if(B>24.9&&B<29.9){
            System.out.println("体重过重");
        }
        else if(B>=29.9){
            System.out.println("肥胖");
        }
    }
}


