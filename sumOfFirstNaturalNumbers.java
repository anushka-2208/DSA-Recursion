// Sum of First N Natural Numbers

public class sumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        int result = sm(5);
        System.out.println(result);
    }
    public static int sm(int n ){
        int sum = 0;
        for(int i = 1; i<= n ; i++){
            sum += i;
        }
        return sum;
    }
}
