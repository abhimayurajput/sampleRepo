import java.util.HashMap;
import java.util.Map;

public class WithoutRepeatationSubString {
	public static void main(String[] args) {
        String str="ababcd";
        Map<Character,Integer> map=new HashMap<>();
        int longestSubstringLength=0;
        String longestSubstring="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                i=map.get(ch);
                map.clear();
            }
            if (map.size()>longestSubstringLength){
                longestSubstringLength=map.size();
                longestSubstring=map.keySet().toString();
            }
        }
        System.out.println(longestSubstring);
    }
}
