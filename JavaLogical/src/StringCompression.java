import java.util.HashMap;
import java.util.Map;

public class StringCompression {
	public static void main(String[] args) {
        String str="ababcd";
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb.toString());
    }
}
