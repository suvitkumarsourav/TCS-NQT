public class Test {
    public static void lcmTwo(int a, int b){
        int hcf=1;
        for(int i=1;i<=a||i<=b;i++)
        {
            if(a%i==0 && b%i==0){
                 hcf=i;
            }
        }
        //Lcm formula
        int lcm=(a*b)/hcf;
        System.out.println("LCM of two number " + a + " and " + b + " is "  +lcm);
    }
    public static void main(String[] args) {
        int num1=16;
        int num2=12;
        lcmTwo(num1, num2);
    }
}
