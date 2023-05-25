import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
        String str="hi hello abhi hi namaste abhi";

        String[] strArr=str.split(" ");
        Set<String> setStr=new LinkedHashSet<>();
        for (String s:strArr){
            setStr.add(s);
        }
        System.out.println(setStr);

        //sorted array
        int[] arr={10,10,20,30,40,50};
        int[] res=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                res[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));

        int[] unsortedArray={2,3,2,4,5,6,4};
        Set<Integer> set=new HashSet<>();
        for (int i:unsortedArray){
            set.add(i);
        }
        System.out.println(set);
    }
}
