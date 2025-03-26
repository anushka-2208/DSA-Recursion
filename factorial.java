// finding factorial

public class factorial {
    public static void main(String[] args) {
        int result = fact(5);
        System.out.println("The factorial is " + result);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
