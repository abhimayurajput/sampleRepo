import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
public static void main(String[] args) {
	int[] arr={2,1,4,5,6};
    int length=arr.length+1;
    int total_sum=length*(length+1)/2;
    int sum=0;
    for(int i:arr){
        sum+=i;
    }
   // System.out.println(total_sum-sum);
    int[] arr2={2,1,4,5,6,8};
    Set<Integer> set=new HashSet<>();
    for (int i:
         arr2) {
        set.add(i);
    }
    for (int i=0;i<arr2.length+1;i++){
        if (!set.contains(i)){
            System.out.println(i);
        }
    }
}
}
