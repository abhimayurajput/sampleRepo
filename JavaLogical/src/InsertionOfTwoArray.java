import java.util.HashSet;
import java.util.Set;

public class InsertionOfTwoArray {
	public static void main(String[] args) {
        int[] arr1={5,2,4};
        int[] arr2={6,4,7};
        Set<Integer> hs=new HashSet<>();
        for (int i:arr1){
            hs.add(i);
        }
        for (int i:arr2){
            if (hs.contains(i)){
                System.out.println(i);
            }
        }
    }
}
