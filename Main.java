public class Main{
    public static void isEvenOdd(int n){
        if(n%2==0){
            System.out.println(n + " is Even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args){
        int result=77;
        isEvenOdd(result);
    }
}