import java.util.HashSet;
import java.util.Set;

public class InsertionInArray {
public static void main(String[] args) {
	int[] arr1={2,3,4,5};
    int[] arr2={6,7,9,8,4};
    Set<Integer> set=new HashSet<>();
    for (int i:arr1){
        set.add(i);
    }
    for (int i=0;i<arr2.length;i++){
        if (set.contains(arr2[i])){
            System.out.println(arr2[i]);
        }
    }
}
}
