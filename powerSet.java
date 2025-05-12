import java.util.List;
import java.util.ArrayList;

public class powerSet {
    public static void pSet(int[] arr, int i, List<Integer> ansr){
        if(i==arr.length){
            System.out.println(ansr);
            return;
        }
        ansr.add(arr[i]);
        pSet(arr, i+1, ansr);

        ansr.remove(ansr.size()-1);
        pSet(arr, i+1, ansr);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> ansr = new ArrayList<>();
        pSet(arr, 0, ansr);
    }
}
