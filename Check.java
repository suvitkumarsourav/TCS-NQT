public class Check{
    public static boolean check(int num){
        if(num>0)
        
            return true;
        else
        
            return false;

    }
    public static void main(String[] args){
        int num=10;
        if(check(num)){
            System.out.println(num + " is positive");
            
        }
        else{
            System.out.println(num + " is negative");
        }
    }
    
}
       