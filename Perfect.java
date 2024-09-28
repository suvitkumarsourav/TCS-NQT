
class Perfect{
    public  void check(int number){
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        if(sum==number){
            System.out.println(number + "  perfect");
        }
        else
        {
            System.out.println(number + "  not perfect");
        }
    }
    public static void main(String[] args) {
        int number1=28;
        Main s=new Main();
        int res=s.check();
    
}