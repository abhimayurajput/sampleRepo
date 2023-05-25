import java.util.HashMap;
import java.util.Map;

public class DescendingOrderBasedOnFrequency {
	public static void main(String[] args) {
		String str="banana";
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue().compareTo(entry.getValue())<0){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
	}

}
