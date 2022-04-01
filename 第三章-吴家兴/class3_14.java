public class class3_14 {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int x=i%10;
            int y=i%100/10;
            int z=i/100;
            int sum=x*x*x+y*y*y+z*z*z;
            if(sum==i){
                System.out.println("水仙花数:"+sum);
            }
        }
    }
}

