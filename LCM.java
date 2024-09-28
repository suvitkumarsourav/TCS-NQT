public class LCM{
    public static void main(String[] args){
        int a=2;
        int b=4;
        int hcf=1;
        for(int i=1;i<=a||i<=b;i++){
            if(a%i==0&&b%i==0)
            hcf=i;
        }
       int lcm=(a*b)/hcf;
        System.out.println("the output is " +lcm);
    }
}

