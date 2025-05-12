import java.util.List;
import java.util.ArrayList;

public class subSeq{
    public static void printSubSeq(int arr[], int i, List<Integer> curr ){
        if(i==arr.length){
            System.out.println(curr);
        }
        curr.add(arr[i]);
        printSubSeq(arr, i+1, curr);

        curr.remove(curr.size()-1);
        printSubSeq(arr, i+1, curr);
    }
    public static void main(String[] args) {
        List<Integer> curr = new ArrayList<>();
        int[] arry = {3,2,1};
        printSubSeq(arry, 0, curr);
    }
}