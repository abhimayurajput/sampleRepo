import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
public static void main(String[] args) {
	int[] arr={2,1,3,4,5,3,3,3,3};
    Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i],1);
        }else{
            map.put(arr[i],map.get(arr[i])+1);
        }
    }

    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()>9/2){
            System.out.println(entry.getKey());
            break;
        }
    }
}
}
